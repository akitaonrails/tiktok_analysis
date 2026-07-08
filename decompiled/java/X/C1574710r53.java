package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallShopCartAssem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0r53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1574710r53 extends C2217421BqW implements InterfaceC1631620sYq<Map<String, String>, Function2<? super Map<String, ? extends String>, ? super Map<String, ? extends Object>, ? extends Unit>, String, Unit> {
    public C1574710r53(MixMallShopCartAssem mixMallShopCartAssem) {
        super(3, mixMallShopCartAssem, MixMallShopCartAssem.class, "setupCartClickListener", "setupCartClickListener(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Map<String, String> map, Function2<? super Map<String, ? extends String>, ? super Map<String, ? extends Object>, ? extends Unit> function2, String str) {
        MixMallShopCartAssem mixMallShopCartAssem = (MixMallShopCartAssem) this.receiver;
        mixMallShopCartAssem.No(str, map, function2);
        return Unit.LIZ;
    }
}
