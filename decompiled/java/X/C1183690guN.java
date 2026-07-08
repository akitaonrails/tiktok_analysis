package X;

import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.IDynamicBottomBarShowHideAbility;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0guN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183690guN extends AbstractC1181640gr4 implements InterfaceC1181380gqe, InterfaceC1180270gor {
    public final InterfaceC665370Q7z LLILLJJLI;
    public String LLILLL = "poi_head_info";
    public String LLILZ;

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIIJ() {
        this.LL = null;
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    public C1183690guN(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILLJJLI = interfaceC665370Q7z;
    }

    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIJJLI(InterfaceC1181010gq3 interfaceC1181010gq3) {
        C1186840gzS c1186840gzSLw1;
        this.LL = interfaceC1181010gq3;
        if (interfaceC1181010gq3 != null && (c1186840gzSLw1 = interfaceC1181010gq3.lw1()) != null) {
            c1186840gzSLw1.LIZIZ("SlashScrollPositionEvent", this);
        }
    }

    @Override // X.InterfaceC1180270gor
    public void onEvent(AbstractC1186480gys abstractC1186480gys) {
        IDynamicBottomBarShowHideAbility iDynamicBottomBarShowHideAbility;
        if (!(abstractC1186480gys instanceof C1183700guO)) {
            return;
        }
        C1183700guO c1183700guO = (C1183700guO) abstractC1186480gys;
        if (c1183700guO.LLILZ == C056A.FINGER_UP && Intrinsics.LJFF(this.LLILZ, this.LLILLL) && !Intrinsics.LJFF(c1183700guO.LLILLJJLI, this.LLILZ)) {
            IDynamicBottomBarShowHideAbility iDynamicBottomBarShowHideAbility2 = (IDynamicBottomBarShowHideAbility) C1558520qew.LIZ(this.LLILLJJLI, IDynamicBottomBarShowHideAbility.class, null);
            if (iDynamicBottomBarShowHideAbility2 != null) {
                iDynamicBottomBarShowHideAbility2.TU1(true);
            }
        } else if (c1183700guO.LLILZ == C056A.FINGER_DOWN && !Intrinsics.LJFF(this.LLILZ, this.LLILLL) && Intrinsics.LJFF(c1183700guO.LLILLJJLI, this.LLILLL) && (iDynamicBottomBarShowHideAbility = (IDynamicBottomBarShowHideAbility) C1558520qew.LIZ(this.LLILLJJLI, IDynamicBottomBarShowHideAbility.class, null)) != null) {
            iDynamicBottomBarShowHideAbility.TU1(false);
        }
        this.LLILZ = c1183700guO.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    @Override // X.InterfaceC1181380gqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mC(X.C1180620gpQ r6, X.EnumC1181510gqr r7, boolean r8, java.lang.String r9) {
        /*
            r5 = this;
            if (r9 == 0) goto L3
            return
        L3:
            if (r8 != 0) goto L6
            return
        L6:
            X.0gqr r0 = X.EnumC1181510gqr.REQUEST
            if (r7 == r0) goto Lb
            return
        Lb:
            r1 = 1
            if (r6 == 0) goto L74
            boolean r0 = r6.LLILLJJLI
            if (r0 != r1) goto L74
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r0 = X.C1183670guL.LIZIZ(r6)
            if (r0 == 0) goto L73
            java.lang.Integer r0 = r0.getPoiDetailPageOpt()
            if (r0 == 0) goto L73
            int r0 = r0.intValue()
            if (r0 != r1) goto L73
            java.util.List r1 = r6.LJIILIIL()
            r4 = 0
            if (r1 == 0) goto L5d
            int r0 = r1.size()
            java.util.ListIterator r3 = r1.listIterator(r0)
        L33:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L55
            java.lang.Object r2 = r3.previous()
            r0 = r2
            X.0gpu r0 = (X.C1180920gpu) r0
            com.ss.android.ugc.aweme.slash.component.BaseComponentData r1 = r0.LIZLLL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r1 = (com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse) r1
            java.lang.Boolean r1 = r1.getShowBottomBarWhenDisappear()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L52:
            if (r0 == 0) goto L33
            r4 = r2
        L55:
            X.0gpu r4 = (X.C1180920gpu) r4
            if (r4 == 0) goto L5d
            java.lang.String r0 = r4.LIZ
            if (r0 != 0) goto L5f
        L5d:
            java.lang.String r0 = "poi_head_info"
        L5f:
            r5.LLILLL = r0
            return
        L62:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PoiDetailLynxResponse
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiDetailLynxResponse r1 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PoiDetailLynxResponse) r1
            java.lang.Boolean r1 = r1.getShowBottomBarWhenDisappear()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            goto L52
        L73:
            return
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1183690guN.mC(X.0gpQ, X.0gqr, boolean, java.lang.String):void");
    }
}
