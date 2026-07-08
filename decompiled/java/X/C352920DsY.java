package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0DsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.video.layer.datamanager.ItemIconFetcher$refreshListIconsFromEffectPlatform$4", f = "ItemIconFetcher.kt", l = {}, m = "invokeSuspend")
public final class C352920DsY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<List<Effect>> LL;
    public final /* synthetic */ Map<String, List<C352950Dsb>> LLILLJJLI;
    public final /* synthetic */ InterfaceC352930DsZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352920DsY(C259800zU<List<Effect>> c259800zU, Map<String, List<C352950Dsb>> map, InterfaceC352930DsZ interfaceC352930DsZ, InterfaceC1364105Vn<? super C352920DsY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = map;
        this.LLILLL = interfaceC352930DsZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352920DsY(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C352950Dsb> list;
        NLEResourceNode effectSDKFilter;
        String resourceId;
        C1C7U.LIZ("ItemIconFetcher@d71.refreshListIconsFromEffectPlatform$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<List<Effect>> c259800zU = this.LL;
        List<Effect> list2 = c259800zU.element;
        Map<String, List<C352950Dsb>> map = this.LLILLJJLI;
        InterfaceC352930DsZ interfaceC352930DsZ = this.LLILLL;
        for (Effect effect : list2) {
            if (effect != null && effect.getResourceId().length() != 0 && (list = map.get(effect.getResourceId())) != null) {
                for (C352950Dsb c352950Dsb : list) {
                    if (c352950Dsb.LIZIZ == EnumC355990DxV.FILTER) {
                        List<Effect> list3 = c259800zU.element;
                        String resourceName = null;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            int i = 0;
                            for (Effect effect2 : list3) {
                                if (effect2 != null) {
                                    resourceId = effect2.getResourceId();
                                } else {
                                    resourceId = null;
                                }
                                if (Intrinsics.LJFF(resourceId, effect.getResourceId()) && (i = i + 1) < 0) {
                                    C1697810uHb.LJIJ();
                                    throw null;
                                }
                            }
                            if (i > 1) {
                                NLESegmentFilter nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(c352950Dsb.LJI.getMainSegment());
                                if (nLESegmentFilterDynamicCast != null && (effectSDKFilter = nLESegmentFilterDynamicCast.getEffectSDKFilter()) != null) {
                                    resourceName = effectSDKFilter.getResourceName();
                                }
                                if (!Intrinsics.LJFF(resourceName, effect.getName())) {
                                }
                            }
                        }
                    }
                    String str = (String) C13LP.LJJJLL(effect.getIcon_url().getUrlList());
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    c352950Dsb.LJ = str;
                    if (interfaceC352930DsZ != null) {
                        String uuid = c352950Dsb.LJI.getUUID();
                        String str3 = c352950Dsb.LJ;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        interfaceC352930DsZ.LIZLLL(uuid, str2);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ItemIconFetcher@d71.refreshListIconsFromEffectPlatform$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
