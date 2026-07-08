package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.Map;

/* JADX INFO: renamed from: X.0HrQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454140HrQ {
    public static void LIZJ(Context context) {
        C19EG c19egLIZIZ;
        DialogFragment dialogFragment;
        Dialog dialog;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            Fragment fragmentLJJJJZI = c19egLIZIZ.getSupportFragmentManager().LJJJJZI("CommentStickerClickHelper");
            if ((fragmentLJJJJZI instanceof AppCompatDialogFragment) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null && dialogFragment.getDialog() != null && dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && dialog.isShowing()) {
                dialogFragment.dismiss();
            }
        }
    }

    public static void LIZ(View view, CommentStickerStruct commentStickerStruct, boolean z, final String str, final Map map, final String str2) {
        Integer stickerType;
        Long lLJIILIIL;
        String id;
        String id2;
        if (view != null && commentStickerStruct != null && (stickerType = commentStickerStruct.getStickerType()) != null) {
            int iIntValue = stickerType.intValue();
            String string = null;
            if (!C453560HqU.LIZJ(Integer.valueOf(iIntValue)) && (id2 = commentStickerStruct.getId()) != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(id2);
            } else {
                lLJIILIIL = null;
            }
            if (C453560HqU.LIZJ(Integer.valueOf(iIntValue))) {
                id = commentStickerStruct.getId();
            } else {
                id = null;
            }
            Long setId = commentStickerStruct.getSetId();
            Long creatorUid = commentStickerStruct.getCreatorUid();
            if (lLJIILIIL == null && id == null) {
                return;
            }
            if (z) {
                InterfaceC450440HlS interfaceC450440HlS = new InterfaceC450440HlS() { // from class: X.0Hrc
                    @Override // X.InterfaceC450440HlS
                    public final void LIZ(StickerItem stickerItem) {
                        if (stickerItem != null) {
                            Map<String, String> map2 = map;
                            C1350920lG6.LJJIJ(str, EnumC454270Hrd.UNSAVE_STICKER.getValue(), EnumC454240Hra.SUCCESS.getValue(), "", str2, map2);
                        }
                    }

                    @Override // X.InterfaceC450440HlS
                    public final void onFail(int i) {
                        C1350920lG6.LJJIJ(str, EnumC454270Hrd.UNSAVE_STICKER.getValue(), EnumC454240Hra.FAIL.getValue(), String.valueOf(i), str2, map);
                    }
                };
                IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics().setBizType("comment");
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0HY2(view, lLJIILIIL, id, iIntValue, "video_comment", setId, interfaceC450440HlS, 2131848906, null), 3);
            } else {
                if (creatorUid != null) {
                    string = creatorUid.toString();
                }
                LIZIZ(view, str, lLJIILIIL, id, iIntValue, string, 2131848904, new InterfaceC450440HlS() { // from class: X.0Hrb
                    @Override // X.InterfaceC450440HlS
                    public final void LIZ(StickerItem stickerItem) {
                        if (stickerItem != null) {
                            Map<String, String> map2 = map;
                            C1350920lG6.LJJIJ(str, EnumC454270Hrd.SAVE_STICKER.getValue(), EnumC454240Hra.SUCCESS.getValue(), "", str2, map2);
                        }
                    }

                    @Override // X.InterfaceC450440HlS
                    public final void onFail(int i) {
                        C1350920lG6.LJJIJ(str, EnumC454270Hrd.SAVE_STICKER.getValue(), EnumC454240Hra.FAIL.getValue(), String.valueOf(i), str2, map);
                    }
                });
            }
        }
    }

    public static void LIZIZ(View view, String str, Long l, String str2, int i, String str3, Integer num, InterfaceC450440HlS interfaceC450440HlS) {
        IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics().setBizType("comment");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0HY1(l, str, "video_comment", view, str2, i, str3, interfaceC450440HlS, num, null), 3);
    }
}
