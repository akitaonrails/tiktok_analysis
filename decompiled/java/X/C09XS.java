package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09XS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09XS {
    public static List LIZ(AwemeDraft awemeDraft) {
        InfoStickerModel infoStickerModelLJFF;
        List<StickerItemModel> list;
        if (awemeDraft.LJJJJIZL.isUpdateInfoStickers && awemeDraft != null && (infoStickerModelLJFF = awemeDraft.LJFF()) != null && (list = infoStickerModelLJFF.stickers) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                StickerItemModel stickerItemModel2 = stickerItemModel;
                if (stickerItemModel2.type == 0 && !TextUtils.isEmpty(stickerItemModel2.stickerId)) {
                    arrayList.add(stickerItemModel);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C19567911h7 r7, java.util.List<? extends com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C09XP
            if (r0 == 0) goto L23
            r5 = r9
            X.09XP r5 = (X.C09XP) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r5.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L34
            if (r2 == r0) goto L31
            if (r2 != r1) goto L29
            goto L55
        L23:
            X.09XP r5 = new X.09XP
            r5.<init>(r6, r9)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.11h7 r7 = r5.LL
            goto L42
        L34:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r7     // Catch: java.lang.Throwable -> L5f
            r5.LLILZ = r0     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r4 = r7.LIZIZ(r8, r5)     // Catch: java.lang.Throwable -> L5f
            if (r4 != r3) goto L45
            return r3
        L42:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L5f
        L45:
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L7a
            r0 = 0
            r5.LL = r0     // Catch: java.lang.Throwable -> L5f
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r4 = X.C19567911h7.LIZ(r7, r4, r5)     // Catch: java.lang.Throwable -> L5f
            if (r4 != r3) goto L58
            return r3
        L55:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L5f
        L58:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r4.booleanValue()     // Catch: java.lang.Throwable -> L5f
            goto L7b
        L5f:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0MAY r2 = X.C0MAY.LIZIZ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "DraftBoxFragment : refreshDraftList , updateEffect --- resumeWithException : "
            r1.<init>(r0)
            java.lang.String r0 = X.C201955140j.LJIIJJI(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C201955140j.LJII(r2, r0)
        L7a:
            r0 = 0
        L7b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09XS.LIZIZ(X.11h7, java.util.List, X.05Vn):java.lang.Object");
    }
}
