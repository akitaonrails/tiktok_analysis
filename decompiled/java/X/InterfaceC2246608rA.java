package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08rA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2246608rA extends C05YF {
    void Cm(List<String> list, List<String> list2, List<Boolean> list3, Function1<? super List<String>, Unit> function1, Function2<? super Integer, ? super String, Unit> function2);

    List<ReadTextEffectBean> FY1(List<ReadTextEffectBean> list);

    Object UY(Function1<? super EffectCategoryModel, Boolean> function1, Map<String, String> map, InterfaceC1364105Vn<? super List<? extends List<? extends ReadTextEffectBean>>> interfaceC1364105Vn);
}
