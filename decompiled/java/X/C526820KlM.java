package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.util.SkipAIGCLoadComponent$closeScene$1", f = "SkipAIGCLoadComponent.kt", l = {}, m = "invokeSuspend")
public final class C526820KlM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NavigationScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526820KlM(NavigationScene navigationScene, InterfaceC1364105Vn<? super C526820KlM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = navigationScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526820KlM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkipAIGCLoadComponent@d3a7.closeScene$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Scene> sceneList = this.LL.getSceneList();
        ArrayList arrayList = new ArrayList();
        for (Scene scene : sceneList) {
            if (scene instanceof C1665410tRL) {
                arrayList.add(scene);
            }
        }
        NavigationScene navigationScene = this.LL;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            navigationScene.remove((Scene) it2.next());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkipAIGCLoadComponent@d3a7.closeScene$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
