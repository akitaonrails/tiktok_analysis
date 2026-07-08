package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.image.TemplatesPanelResp;
import com.ss.android.ugc.aweme.sticker.model.PropInfoData;
import com.ss.android.ugc.aweme.sticker.repository.StreamServiceCreator;
import com.ss.android.ugc.aweme.sticker.repository.internals.HorizontalEffectsFetcher;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import duk.p;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import suk.g;
import wuk.d0;
import wuk.f;

/* JADX INFO: renamed from: X.0sUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1629150sUr implements InterfaceC1628820sUK {
    public final C1629320sV8 LIZ;
    public final InterfaceC1635390sev LIZIZ;
    public final InterfaceC1629550sVV LIZJ;
    public final List<EffectCategoryModel> LIZLLL;
    public final boolean LJ;
    public InterfaceC1629750sVp LJFF;
    public Function0<? extends C091J> LJI;

    /* JADX WARN: Type inference failed for: r1v8, types: [X.0sUt] */
    @Override // X.InterfaceC1628820sUK
    public f LIZ(p pVar) {
        C13RD effectConfig;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 888));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS569S0100000_25(this, 886));
        C1411890mqR c1411890mqR = C1411890mqR.LIZ;
        String str = this.LIZ.LIZ;
        c1411890mqR.getClass();
        C1411890mqR.LIZIZ = str;
        C01GW<? extends C091J> c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS569S0100000_25(this, 883));
        C01GW c01gwLIZIZ4 = C452501pT.LIZIZ(new AwS547S0100000_3(c01gwLIZIZ3, (C01GW<String>) 127));
        C01GW c01gwLIZIZ5 = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(467));
        InterfaceC1635390sev interfaceC1635390sev = this.LIZIZ;
        final C1629320sV8 c1629320sV8 = this.LIZ;
        final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(interfaceC1635390sev, 889);
        ?? r1 = new InterfaceC1629300sV6(awS569S0100000_25, c1629320sV8) { // from class: X.0sUt
            public final Function0<InterfaceC1635390sev> LIZ;
            public final C1629320sV8 LIZIZ;

            @Override // X.InterfaceC1629300sV6
            public final boolean LIZ(Effect effect) {
                if (Intrinsics.LJFF(this.LIZIZ.LJIIJJI, effect.getEffect_id())) {
                    return true;
                }
                InterfaceC1635390sev interfaceC1635390sevInvoke = this.LIZ.invoke();
                if (effect.getEffectType() != 0 || interfaceC1635390sevInvoke.LJIJJLI(effect)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1629300sV6
            public final boolean LIZIZ(Effect effect) {
                return C1629180sUu.LIZ(effect, this.LIZ.invoke());
            }

            {
                this.LIZ = awS569S0100000_25;
                this.LIZIZ = c1629320sV8;
            }
        };
        C01GW c01gwLIZIZ6 = C452501pT.LIZIZ(new AwS426S0200000_25(new AwS426S0200000_25((C1629170sUt) r1, this, 149), this, 148));
        C1629320sV8 c1629320sV82 = this.LIZ;
        String str2 = c1629320sV82.LIZ;
        InterfaceC1635390sev interfaceC1635390sev2 = this.LIZIZ;
        boolean z = this.LJ;
        C1629640sVe c1629640sVe = c1629320sV82.LJ;
        g gVar = new g(str2, interfaceC1635390sev2, z, c1629640sVe.LIZ, c1629640sVe.LIZIZ);
        HorizontalEffectsFetcher horizontalEffectsFetcher = new HorizontalEffectsFetcher(this.LIZ.LIZ, this.LIZIZ);
        C11T4<Unit, CategoryPageModel, C1631810sZ9, CategoryPageModel> c11t4LIZIZ = LIZIZ(this.LIZ.LIZ, this.LIZIZ, c01gwLIZIZ3);
        d0 d0VarLIZJ = LIZJ(this.LIZ.LJI, pVar, this.LIZLLL, c01gwLIZIZ4, c01gwLIZIZ5, c01gwLIZIZ3);
        new C11T3<Unit, TemplatesPanelResp, C1FV0, TemplatesPanelResp>() { // from class: X.0sUs
            @Override // X.C11T3, X.C11T4
            public final /* bridge */ /* synthetic */ Object convertKeyActual(Object obj) {
                return Unit.LIZ;
            }

            @Override // X.C11T3
            public final C11NZ<TemplatesPanelResp> requestActual(C1FV0 c1fv0) {
                return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.08Pr
                    @Override // X.InterfaceC1478005qU
                    public final void subscribe(C09AJ<TemplatesPanelResp> c09aj) {
                        C1C7U.LIZ("DefaultImageTemplateFetcher@df47.requestActual$1");
                        c09aj.onError(new Exception("image sticker is null"));
                        C1C7U.LIZIZ("DefaultImageTemplateFetcher@df47.requestActual$1");
                    }
                });
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return obj2;
            }
        };
        String str3 = this.LIZ.LIZ;
        InterfaceC1635390sev interfaceC1635390sev3 = this.LIZIZ;
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(StreamServiceCreator.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            C0D9A c0d9aCreate = ((StreamServiceCreator) objPluggableSpi$default).create();
            EffectConfiguration effectConfigurationLJJIIZ = this.LIZIZ.LJJIIZ();
            if (effectConfigurationLJJIIZ != null && (effectConfig = effectConfigurationLJJIIZ.getEffectConfig()) != null) {
                C1633750scH c1633750scH = new C1633750scH(c0d9aCreate, effectConfig);
                C1629320sV8 c1629320sV83 = this.LIZ;
                return new f(str3, interfaceC1635390sev3, c11t4LIZIZ, gVar, horizontalEffectsFetcher, d0VarLIZJ, c01gwLIZIZ2, c01gwLIZIZ, c01gwLIZIZ6, r1, c01gwLIZIZ4, c01gwLIZIZ5, c01gwLIZIZ3, pVar, c1633750scH, c1629320sV83.LJIJ, c1629320sV83.LJIJI);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C11T4<Unit, CategoryPageModel, C1631810sZ9, CategoryPageModel> LIZIZ(String str, InterfaceC1635390sev interfaceC1635390sev, C01GW<? extends C091J> c01gw) {
        return new C1628840sUM(this.LIZ.LIZ, interfaceC1635390sev, c01gw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1629150sUr(C1629320sV8 c1629320sV8, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1629550sVV interfaceC1629550sVV, List<? extends EffectCategoryModel> list, boolean z) {
        this.LIZ = c1629320sV8;
        this.LIZIZ = interfaceC1635390sev;
        this.LIZJ = interfaceC1629550sVV;
        this.LIZLLL = list;
        this.LJ = z;
    }

    public d0 LIZJ(PropInfoData propInfoData, p pVar, List list, C01GW c01gw, C01GW c01gw2, C01GW c01gw3) {
        PropInfoData propInfoData2 = propInfoData;
        if (propInfoData2 == null) {
            propInfoData2 = new PropInfoData(Boolean.FALSE, null, null, null, null, null, null);
        }
        return new d0(propInfoData2, pVar, list, c01gw, c01gw2, c01gw3);
    }
}
