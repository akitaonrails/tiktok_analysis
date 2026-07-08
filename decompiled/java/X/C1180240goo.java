package X;

import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM;
import com.ss.android.ugc.aweme.poi.detail.amusement.model.PoiAmusementDataModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.data.SlashEvent;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0goo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180240goo extends AbstractC1180290got<PoiAmusementDataModel> {
    public PoiAmusementListSharedVM LLILZ;
    public long LLILZIL;

    @Override // X.AbstractC1180290got
    public final String LJJIIJ() {
        return "poi_amusement";
    }

    @Override // X.AbstractC1180290got
    public final Class<?> LJJIFFI() {
        return PoiAmusementDataModel.class;
    }

    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIJJLI(InterfaceC1181010gq3 interfaceC1181010gq3) {
        this.LL = interfaceC1181010gq3;
        LJJIJIIJIL("img_card_click", new InterfaceC1180270gor() { // from class: X.0gon
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00ee A[Catch: all -> 0x012f, TryCatch #0 {all -> 0x012f, blocks: (B:9:0x0020, B:11:0x0024, B:13:0x0028, B:15:0x0034, B:16:0x0036, B:18:0x0042, B:19:0x0044, B:21:0x0050, B:22:0x0052, B:24:0x0056, B:26:0x005a, B:28:0x0060, B:29:0x006f, B:31:0x0075, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x009a, B:41:0x009e, B:43:0x00a4, B:51:0x00b2, B:53:0x00b8, B:55:0x00be, B:57:0x00c8, B:62:0x00d9, B:64:0x00e1, B:71:0x0109, B:66:0x00ee, B:68:0x00f4, B:70:0x0103, B:74:0x0115, B:76:0x0119, B:78:0x011f, B:72:0x010f, B:73:0x0111), top: B:83:0x0020 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x00f4 A[Catch: all -> 0x012f, TryCatch #0 {all -> 0x012f, blocks: (B:9:0x0020, B:11:0x0024, B:13:0x0028, B:15:0x0034, B:16:0x0036, B:18:0x0042, B:19:0x0044, B:21:0x0050, B:22:0x0052, B:24:0x0056, B:26:0x005a, B:28:0x0060, B:29:0x006f, B:31:0x0075, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x009a, B:41:0x009e, B:43:0x00a4, B:51:0x00b2, B:53:0x00b8, B:55:0x00be, B:57:0x00c8, B:62:0x00d9, B:64:0x00e1, B:71:0x0109, B:66:0x00ee, B:68:0x00f4, B:70:0x0103, B:74:0x0115, B:76:0x0119, B:78:0x011f, B:72:0x010f, B:73:0x0111), top: B:83:0x0020 }] */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0115 A[Catch: all -> 0x012f, TryCatch #0 {all -> 0x012f, blocks: (B:9:0x0020, B:11:0x0024, B:13:0x0028, B:15:0x0034, B:16:0x0036, B:18:0x0042, B:19:0x0044, B:21:0x0050, B:22:0x0052, B:24:0x0056, B:26:0x005a, B:28:0x0060, B:29:0x006f, B:31:0x0075, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x009a, B:41:0x009e, B:43:0x00a4, B:51:0x00b2, B:53:0x00b8, B:55:0x00be, B:57:0x00c8, B:62:0x00d9, B:64:0x00e1, B:71:0x0109, B:66:0x00ee, B:68:0x00f4, B:70:0x0103, B:74:0x0115, B:76:0x0119, B:78:0x011f, B:72:0x010f, B:73:0x0111), top: B:83:0x0020 }] */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.0goo, X.0gr4] */
            /* JADX WARN: Type inference failed for: r8v0, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
            /* JADX WARN: Type inference failed for: r8v1 */
            /* JADX WARN: Type inference failed for: r8v6 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1180270gor
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onEvent(X.AbstractC1186480gys r10) {
                /*
                    Method dump skipped, instruction units count: 316
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1180230gon.onEvent(X.0gys):void");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1180290got
    public final void LJJIIZI(Object obj, String str) {
        Fragment fragmentS8;
        String typeLevel;
        List<SlashEvent> listL00;
        String str2;
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS;
        PoiAmusementDataModel poiAmusementDataModel = (PoiAmusementDataModel) obj;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (fragmentS8 = interfaceC1181010gq3.S8()) != null) {
            PoiAmusementListSharedVM poiAmusementListSharedVM = (PoiAmusementListSharedVM) new C736950SvV(C13LE.LIZ(PoiAmusementListSharedVM.class), new AwS562S0100000_18(this, 2699), new C452070Ho5(), C724750Sbp.LJII(fragmentS8), C1220000hqw.LIZ(fragmentS8), AFwS256S0000000_18.get$arr$(1001), new C451460Hn6(fragmentS8, false), new C451620HnM(fragmentS8, true), new C338520DOw(fragmentS8)).getValue();
            this.LLILZ = poiAmusementListSharedVM;
            poiAmusementListSharedVM.LLJILJIL = str;
            poiAmusementListSharedVM.LLJIJIL = C1174830gg5.LIZ(fragmentS8);
            PoiAmusementListSharedVM poiAmusementListSharedVM2 = this.LLILZ;
            if (poiAmusementListSharedVM2 != null) {
                InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
                if (interfaceC1181010gq32 != null && (c1173300gdcQr0 = interfaceC1181010gq32.qr0()) != null && (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) != null) {
                    str2 = c1185600gxS.LIZ;
                } else {
                    str2 = null;
                }
                poiAmusementListSharedVM2.LLIZLLLIL = str2;
            }
            PoiAmusementListSharedVM poiAmusementListSharedVM3 = this.LLILZ;
            if (poiAmusementListSharedVM3 != null) {
                poiAmusementListSharedVM3.LLILZLL = poiAmusementDataModel;
                InterfaceC1181010gq3 interfaceC1181010gq33 = this.LL;
                if (interfaceC1181010gq33 != null) {
                    if (str == null) {
                        str = "";
                    }
                    listL00 = interfaceC1181010gq33.l00(str);
                } else {
                    listL00 = null;
                }
                poiAmusementListSharedVM3.LLJ = listL00;
            }
            PoiAmusementListSharedVM poiAmusementListSharedVM4 = this.LLILZ;
            if (poiAmusementListSharedVM4 != null) {
                PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(fragmentS8);
                if (poiDetailResponseLIZ != null) {
                    typeLevel = poiDetailResponseLIZ.getTypeLevel();
                } else {
                    typeLevel = null;
                }
                poiAmusementListSharedVM4.LLJI = typeLevel;
            }
            PoiAmusementListSharedVM poiAmusementListSharedVM5 = this.LLILZ;
            if (poiAmusementListSharedVM5 != null) {
                AssemSingleListViewModel.manualListLoadMore$default(poiAmusementListSharedVM5, null, 1, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIL(View view, Aweme aweme) {
        C1185600gxS c1185600gxS;
        String str;
        Fragment fragmentS8;
        int i;
        C1173300gdc c1173300gdcQr0;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        Unit unit = null;
        if (interfaceC1181010gq3 != null && (c1173300gdcQr0 = interfaceC1181010gq3.qr0()) != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
        } else {
            c1185600gxS = null;
        }
        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
        LruCache<String, String> lruCache = C1180320gow.LIZ;
        String aid = aweme.getAid();
        if (c1185600gxS != null) {
            str = c1185600gxS.LIZ;
        } else {
            str = null;
        }
        C1180320gow.LIZIZ(aid, str);
        try {
            InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
            if (interfaceC1181010gq32 != null && (fragmentS8 = interfaceC1181010gq32.S8()) != null) {
                InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LIZLLL(fragmentS8, C13LE.LIZ(InterfaceC1184330gvP.class));
                Bundle bundleLJFF = c1606420ruCLIZ.LJFF();
                String strLIZ = C18JG.LIZ("c3195.d26984", PageFinder.via(view), null);
                if (C1226204qy.LIZ()) {
                    i = 3;
                } else {
                    i = 0;
                }
                interfaceC1184330gvP.Oe(bundleLJFF, aweme, strLIZ, 46, "POI_AMUSEMENT_ENTRANCE", "feature_feed", null, i, new LinkedHashMap(), null);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
