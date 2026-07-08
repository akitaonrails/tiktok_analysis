package X;

import com.ss.android.ugc.aweme.templateselect.Template;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templateselect.TemplateSelectionViewModel$uiState$1", f = "TemplateSelectionViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1673670tef extends C09AX implements InterfaceC1631630sYr<InterfaceC1673730tel, List<? extends C1698606ky>, String, InterfaceC1364105Vn<? super InterfaceC1673720tek>, Object> {
    public /* synthetic */ InterfaceC1673730tel LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C1673670tef(InterfaceC1364105Vn<? super C1673670tef> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1673680teg;
        String str;
        int i;
        C1C7U.LIZ("TemplateSelectionViewModel@653c.uiState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1673730tel interfaceC1673730tel = this.LL;
        List<C1698606ky> list = (List) this.LLILLJJLI;
        String str2 = (String) this.LLILLL;
        if (list == null) {
            c1673680teg = C1673760teo.LIZ;
        } else if (list.isEmpty()) {
            c1673680teg = C1673750ten.LIZ;
        } else {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1698606ky c1698606ky : list) {
                Effect effect = c1698606ky.LIZIZ;
                Template.Extras extras = (Template.Extras) C051M.LIZIZ(Template.Extras.class, effect.getExtra());
                String effectId = effect.getEffectId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) C13LP.LJJJLL(c1698606ky.LIZ));
                if (extras == null || (str = extras.coverImg) == null) {
                    str = "";
                }
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (extras != null) {
                    i = extras.count;
                } else {
                    i = 0;
                }
                arrayList.add(new Template(i, effectId, strLIZIZ, Intrinsics.LJFF(effect.getEffectId(), str2)));
            }
            c1673680teg = new C1673680teg(C1687430u0r.LIZ(arrayList), str2, interfaceC1673730tel);
        }
        C1C7U.LIZIZ("TemplateSelectionViewModel@653c.uiState$1");
        return c1673680teg;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(InterfaceC1673730tel interfaceC1673730tel, List<? extends C1698606ky> list, String str, InterfaceC1364105Vn<? super InterfaceC1673720tek> interfaceC1364105Vn) {
        C1673670tef c1673670tef = new C1673670tef(interfaceC1364105Vn);
        c1673670tef.LL = interfaceC1673730tel;
        c1673670tef.LLILLJJLI = list;
        c1673670tef.LLILLL = str;
        return c1673670tef.invokeSuspend(Unit.LIZ);
    }
}
