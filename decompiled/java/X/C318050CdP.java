package X;

import android.content.Context;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.profile.business.effect.StickerItemList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0CdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C318050CdP {
    public final InterfaceC318100CdU LIZ;
    public final InterfaceC318090CdT LIZIZ;

    public final List<CKEDraftInfo> LIZJ() {
        InterfaceC318260Cdk interfaceC318260CdkDraftService;
        Context context = this.LIZ.context();
        if (context == null) {
            return C13BV.INSTANCE;
        }
        IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
        if (iEffectCreatorService == null || (interfaceC318260CdkDraftService = iEffectCreatorService.draftService()) == null) {
            return C13BV.INSTANCE;
        }
        List<CKEDraftInfo> listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0CdK
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((CKEDraftInfo) obj2).getUpdateTime().compareTo(((CKEDraftInfo) obj).getUpdateTime());
            }
        }, interfaceC318260CdkDraftService.LJII(context));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchDraftListSync(), return ");
        sbLIZ.append(listLJLLLL);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectProfileListRepository", C2188811AlT.LIZIZ(sbLIZ));
        return listLJLLLL;
    }

    public C318050CdP(C318130CdX c318130CdX) {
        this.LIZ = c318130CdX;
        InterfaceC318090CdT.LIZ.getClass();
        this.LIZIZ = (InterfaceC318090CdT) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(InterfaceC318090CdT.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C317950CdF> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C318030CdN
            if (r0 == 0) goto L5b
            r5 = r7
            X.0CdN r5 = (X.C318030CdN) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L61
            X.C155000ia.LIZIZ(r2)
        L22:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchDraftCard(), return "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "EffectProfileListRepository"
            com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(r0, r1)
            return r2
        L38:
            X.C155000ia.LIZIZ(r2)
            X.0CdU r0 = r6.LIZ
            boolean r0 = r0.LIZJ()
            r1 = 0
            if (r0 == 0) goto L69
            boolean r0 = X.C1656550tD3.LIZ()
            if (r0 == 0) goto L69
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0CdE r1 = new X.0CdE
            r0 = 0
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r2 = X.C23250099c.LJI(r5, r2, r1)
            if (r2 != r4) goto L22
            return r4
        L5b:
            X.0CdN r5 = new X.0CdN
            r5.<init>(r6, r7)
            goto L12
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L69:
            X.0CdF r0 = new X.0CdF
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318050CdP.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C318040CdO
            if (r0 == 0) goto L37
            r5 = r7
            X.0CdO r5 = (X.C318040CdO) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3d
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0CdJ r1 = new X.0CdJ
            r0 = 0
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L37:
            X.0CdO r5 = new X.0CdO
            r5.<init>(r6, r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318050CdP.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.profile.business.effect.StickerItemList>> r8) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318050CdP.LIZLLL(X.05Vn):java.lang.Object");
    }

    public final StickerItemList LJ(StickerItemList stickerItemList) {
        if (C1656550tD3.LIZ()) {
            List<NewFaceStickerBean> stickers = stickerItemList.getStickers();
            if (!(stickers instanceof Collection) || !stickers.isEmpty()) {
                Iterator<NewFaceStickerBean> it2 = stickers.iterator();
                while (it2.hasNext()) {
                    if (it2.next().moderationStatus == 4) {
                        List<CKEDraftInfo> listLIZJ = LIZJ();
                        ArrayList arrayList = new ArrayList(stickerItemList.getStickers());
                        C19719612Di.LJJIIJ(arrayList, new AwS583S0100000_4(listLIZJ, (List<GroupUnsubscribeSetting>) 161), true);
                        return stickerItemList.copy(stickerItemList.cursor, stickerItemList.hasMore, arrayList, stickerItemList.logPb);
                    }
                }
            }
        }
        return stickerItemList;
    }
}
