package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0MJW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJW {
    public final AsyncAVService LIZ;

    public C0MJW(AsyncAVService asyncAVService) {
        this.LIZ = asyncAVService;
    }

    public final void LIZ(C19EG c19eg, C0MJX c0mjx, final C201969140x c201969140x) {
        C0LGC c0lgc;
        C0LGK c0lgk;
        C0MJU c0mju;
        IRecordService iRecordServiceRecordService = this.LIZ.uiService().recordService();
        int i = C0MJZ.LIZ[c0mjx.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c0lgc = C0LGC.AIGC;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c0lgc = C0LGC.PHOTO_SEARCH;
            }
        } else {
            c0lgc = C0LGC.ECOMMERCE_COMMENT;
        }
        List<EnumC566320MJa> list = c0mjx.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<EnumC566320MJa> it2 = list.iterator();
        while (it2.hasNext()) {
            int i2 = C0MJZ.LIZIZ[it2.next().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            c0mju = C0MJU.M_BEAUTY;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c0mju = C0MJU.FILTER;
                    }
                } else {
                    c0mju = C0MJU.FLASH;
                }
            } else {
                c0mju = C0MJU.REVERSE;
            }
            arrayList.add(c0mju);
        }
        int i3 = C0MJZ.LIZJ[c0mjx.LIZJ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    c0lgk = C0LGK.VIDEO;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c0lgk = C0LGK.PHOTO_AND_VIDEO;
            }
        } else {
            c0lgk = C0LGK.PHOTO;
        }
        iRecordServiceRecordService.startExteriorVideoRecordScene(c19eg, new ExteriorRecordModel(c0lgc, arrayList, c0lgk, c0mjx.LIZLLL, c0mjx.LJ, c0mjx.LJFF, c0mjx.LJI, c0mjx.LJII, c0mjx.LJIIIIZZ, c0mjx.LJIIIZ, c0mjx.LJIIJ, c0mjx.LJIIJJI), new AbstractBinderC539700LEq(c201969140x) { // from class: X.0LEp
            public final AbstractC539760LEw<List<AnonymousClass1410>> LLILLJJLI;

            @Override // X.AbstractBinderC539700LEq
            public final String LIZ() {
                this.LLILLJJLI.LIZIZ();
                return "ecommerce_comment";
            }

            {
                this.LLILLJJLI = c201969140x;
            }

            @Override // X.AbstractBinderC539700LEq
            public final void LIZJ(Activity activity, int i4, Intent intent) {
                ArrayList arrayList2;
                this.LLILLJJLI.LIZ();
                ArrayList<ReturnEcommerceCommentModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("return_ecommerce_comment_model_list");
                AbstractC539760LEw<List<AnonymousClass1410>> abstractC539760LEw = this.LLILLJJLI;
                if (parcelableArrayListExtra == null) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
                    for (ReturnEcommerceCommentModel returnEcommerceCommentModel : parcelableArrayListExtra) {
                        arrayList2.add(new AnonymousClass1410(returnEcommerceCommentModel.originFilePath, returnEcommerceCommentModel.compressFilePath, returnEcommerceCommentModel.originFileSize, returnEcommerceCommentModel.fileSize, returnEcommerceCommentModel.mediaType, returnEcommerceCommentModel.forBase64FilePath, returnEcommerceCommentModel.mimeType));
                    }
                }
                abstractC539760LEw.LIZJ(arrayList2);
            }
        }, "ec_write_review", null, null, null, null);
    }
}
