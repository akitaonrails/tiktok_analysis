package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent$showToolTips$4$3", f = "HeaderAdvancedFeatureBaseUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C1245370iVr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ HeaderAdvancedFeatureBaseUIComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245370iVr(HeaderAdvancedFeatureBaseUIComponent headerAdvancedFeatureBaseUIComponent, InterfaceC1364105Vn<? super C1245370iVr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = headerAdvancedFeatureBaseUIComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1245370iVr(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ProfileComponents profileComponents;
        List<EventParams> list;
        EventParams next;
        String str;
        C1C7U.LIZ("HeaderAdvancedFeatureBaseUIComponent@7be9.showToolTips$4$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1248950ibd c1248950ibd = this.LL.LLJJI;
        String str2 = null;
        if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && (list = profileComponents.eventParams) != null) {
            Iterator<EventParams> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    EventParams eventParams = next;
                    if (eventParams != null) {
                        str = eventParams.event;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "profile_info_collect")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EventParams eventParams2 = next;
            if (eventParams2 != null) {
                str2 = (String) ((Map) C08JS.LIZ(String.valueOf(eventParams2.bizParams), new LinkedHashMap().getClass())).get(Scene.SCENE_SERVICE);
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str2);
        C20684815ws.LJIILLIIL("profile_common_function_intro_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HeaderAdvancedFeatureBaseUIComponent@7be9.showToolTips$4$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
