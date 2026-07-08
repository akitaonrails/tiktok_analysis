package X;

import Y.AfS4S1102000_14;
import android.content.Context;
import android.text.Editable;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.api.ValidInfo;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.api.VideoRelatedInfo;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ZIO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZIO {
    public static final C0ZIO LIZ = new C0ZIO();

    public static int LIZJ(List list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((AVTextExtraStruct) it2.next()).type == 5) {
                i++;
            }
        }
        return i;
    }

    public static final boolean LJ(String str) {
        if (str != null && str.length() != 0 && str.length() >= 23) {
            int length = str.length();
            SettingsManager.LIZLLL().getClass();
            if (length <= SettingsManager.LJ("add_video_by_paste_url_max_length", 2000) && ((u.LJJIIJZLJL(str, "https://", false) || a0.LJJIIZI(str, "https://", false)) && a0.LJJIIZI(str, "tiktok", false))) {
                return true;
            }
        }
        return false;
    }

    public static void LJFF(C0ZI0 c0zi0, C0ZIQ c0ziq) {
        ValidInfo validInfo;
        VideoRelatedInfo videoRelatedInfo;
        VideoInfoFromURLResponse videoInfoFromURLResponse = c0ziq.requestResult;
        int i = videoInfoFromURLResponse.statusCode;
        if (i != 104 && (validInfo = videoInfoFromURLResponse.validInfo) != null) {
            if (i == 0 && (videoRelatedInfo = videoInfoFromURLResponse.videoInfo) != null && validInfo.attachable) {
                String str = videoRelatedInfo.uniqueId;
                String str2 = videoRelatedInfo.authorNickName;
                String strValueOf = String.valueOf(videoRelatedInfo.authorId);
                VideoRelatedInfo videoRelatedInfo2 = c0ziq.requestResult.videoInfo;
                String str3 = videoRelatedInfo2.authorSecUid;
                String strValueOf2 = String.valueOf(videoRelatedInfo2.awemeId);
                VideoRelatedInfo videoRelatedInfo3 = c0ziq.requestResult.videoInfo;
                C0ZIK c0zik = new C0ZIK(str, str2, strValueOf, str3, strValueOf2, videoRelatedInfo3.videoStatus, videoRelatedInfo3.isPrivateAccount(), c0ziq.subType, c0ziq.enterMethod);
                String str4 = c0ziq.requestResult.validInfo.toastContent;
                if (str4 == null) {
                    str4 = "";
                }
                c0zi0.LJIILIIL(c0zik, str4);
                return;
            }
            String str5 = validInfo.toastContent;
            if (str5 == null) {
                return;
            }
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(str5);
            C1390380mHk.LIZLLL(c0zi0, 2023, creativeToastBuilder);
            return;
        }
        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
        creativeToastBuilder2.message(C0CHQ.LIZ.getString(2131849618));
        C1390380mHk.LIZLLL(c0zi0, 2023, creativeToastBuilder2);
    }

    public static void LIZ(int i, int i2, C0ZIH c0zih) {
        if (c0zih != null && c0zih.LLJILJILJ) {
            c0zih.setHasUrlTransforming(false);
            Editable editableQ = C2204961BRm.q(c0zih, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhidbMhcI8Df7O3qypjdtev9I=", null));
            if (editableQ != null) {
                editableQ.delete(i, i2);
            }
            c0zih.setUrlEnd(i);
        }
    }

    public static void LIZLLL(int i, int i2, C0ZIH c0zih, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(a0.LJJLJLI(str, "https://", str));
        AbstractC19484711Kz<VideoInfoFromURLResponse> abstractC19484711KzLIZ = C0ZIP.LIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        InterfaceC19473011Gm interfaceC19473011Gm = new InterfaceC19473011Gm() { // from class: X.0ZIS
            @Override // X.InterfaceC19473011Gm
            public final void LIZ(InterfaceC19474811He<? super VideoInfoFromURLResponse> interfaceC19474811He) {
                interfaceC19474811He.onSuccess(new VideoInfoFromURLResponse(408, null, null));
            }
        };
        abstractC19484711KzLIZ.getClass();
        abstractC19484711KzLIZ.LJJIJIL(10L, timeUnit, C11S5.LIZIZ, interfaceC19473011Gm).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS4S1102000_14(i, i2, c0zih, str, 0), new AfS4S1102000_14(i, i2, c0zih, str, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(int r4, int r5, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6, java.lang.String r7) {
        /*
            X.0LAB r3 = new X.0LAB
            r3.<init>()
            java.lang.String r1 = r6.getCreationId()
            java.lang.String r0 = "creation_id"
            r3.LJ(r0, r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "video_post_page"
            r3.LJ(r1, r0)
            java.lang.String r1 = "shoot_way"
            java.lang.String r0 = r6.mShootWay
            r3.LJ(r1, r0)
            java.lang.String r1 = X.C1428470nHB.LJIILIIL(r6)
            java.lang.String r0 = "content_source"
            r3.LJ(r0, r1)
            java.lang.String r1 = "content_type"
            java.lang.String r0 = X.C1428470nHB.LJIILL(r6)
            r3.LJ(r1, r0)
            if (r7 != 0) goto L32
            java.lang.String r7 = ""
        L32:
            java.lang.String r0 = "enter_method"
            r3.LJ(r0, r7)
            java.lang.String r0 = "author_is_private"
            r3.LIZ(r5, r0)
            r2 = 1
            if (r4 == r2) goto L65
            r0 = 2
            if (r4 == r0) goto L62
            r0 = 140(0x8c, float:1.96E-43)
            if (r4 == r0) goto L65
            r0 = 143(0x8f, float:2.0E-43)
            if (r4 == r0) goto L62
            r0 = 144(0x90, float:2.02E-43)
            if (r4 == r0) goto L65
            java.lang.String r1 = "public"
        L50:
            java.lang.String r0 = "privacy_status"
            r3.LJ(r0, r1)
            java.lang.String r0 = "is_credit"
            r3.LIZ(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "add_quote_video_finish"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L62:
            java.lang.String r1 = "friendVisible"
            goto L50
        L65:
            java.lang.String r1 = "private"
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZIO.LJI(int, int, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String):void");
    }

    public static TuxIconDrawable LIZIZ(C0ZIO c0zio, Context context, int i, int i2, int i3) {
        int i4;
        if ((i3 & 4) != 0) {
            i4 = R.attr.a1h;
        } else {
            i4 = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        }
        c0zio.getClass();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(i4);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, i2, i2);
        return tuxIconDrawableLIZ;
    }
}
