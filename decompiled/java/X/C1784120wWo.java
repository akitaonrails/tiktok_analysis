package X;

import android.text.SpannableString;
import com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplySaveResponse;
import com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.IIMBusinessQuickReplyAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0wWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment$handleSaveResult$1", f = "IMQuickReplyManageFragment.kt", l = {}, m = "invokeSuspend")
public final class C1784120wWo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMQuickReplyManageFragment LL;
    public final /* synthetic */ QuickReplySaveResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784120wWo(IMQuickReplyManageFragment iMQuickReplyManageFragment, QuickReplySaveResponse quickReplySaveResponse, InterfaceC1364105Vn<? super C1784120wWo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMQuickReplyManageFragment;
        this.LLILLJJLI = quickReplySaveResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784120wWo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        IMQuickReply iMQuickReply;
        Integer numLJ;
        String str;
        InterfaceC1784070wWj interfaceC1784070wWj;
        C1C7U.LIZ("IMQuickReplyManageFragment@b31d.handleSaveResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.UR();
        QuickReplySaveResponse quickReplySaveResponse = this.LLILLJJLI;
        if (quickReplySaveResponse != null) {
            i = quickReplySaveResponse.status_code;
        } else {
            i = -1;
        }
        if (quickReplySaveResponse != null) {
            iMQuickReply = quickReplySaveResponse.quickReply;
        } else {
            iMQuickReply = null;
        }
        if (iMQuickReply != null && quickReplySaveResponse.status_code == 0) {
            numLJ = C2286608xc.LJ(quickReplySaveResponse.auditStatus);
            QuickReplySaveResponse quickReplySaveResponse2 = this.LLILLJJLI;
            if (quickReplySaveResponse2.auditStatus == 1) {
                C1793710wmH c1793710wmH = this.LL.LLJJ;
                if (c1793710wmH != null) {
                    c1793710wmH.LIZIZ();
                }
                InterfaceC1784070wWj interfaceC1784070wWj2 = this.LL.LLIZ;
                if (interfaceC1784070wWj2 != null) {
                    interfaceC1784070wWj2.LIZIZ(new C1784040wWg(EnumC1784010wWd.EDIT, this.LLILLJJLI.quickReply));
                }
                IMQuickReplyManageFragment iMQuickReplyManageFragment = this.LL;
                iMQuickReplyManageFragment.getClass();
                C1389890mGx c1389890mGx = new C1389890mGx(iMQuickReplyManageFragment);
                c1389890mGx.LJIIIZ(2131830809);
                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx.LJII(R.attr.a1h);
                c1389890mGx.LJIIJJI();
                IMQuickReplyManageFragment iMQuickReplyManageFragment2 = this.LL;
                IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = iMQuickReplyManageFragment2.LLJJIJIL;
                if (iMQuickReplyManagePageConfig != null && (interfaceC1784070wWj = iMQuickReplyManageFragment2.LLIZ) != null) {
                    BusinessQuickReplyPanelVM businessQuickReplyPanelVMVR = iMQuickReplyManageFragment2.VR();
                    String str2 = iMQuickReplyManagePageConfig.uid;
                    List<C1784040wWg> data = interfaceC1784070wWj.getData();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(data, 10));
                    Iterator<C1784040wWg> it2 = data.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZIZ);
                    }
                    C051N.LIZIZ(str2, arrayList);
                    businessQuickReplyPanelVMVR.LL.setValue(arrayList);
                    IIMBusinessQuickReplyAbility iIMBusinessQuickReplyAbility = (IIMBusinessQuickReplyAbility) iMQuickReplyManageFragment2.LLJJIJI.getValue();
                    if (iIMBusinessQuickReplyAbility != null) {
                        iIMBusinessQuickReplyAbility.FD2();
                    }
                }
            } else {
                C1793710wmH c1793710wmH2 = this.LL.LLJJ;
                if (c1793710wmH2 != null) {
                    IMQuickReply iMQuickReply2 = quickReplySaveResponse2.quickReply;
                    c1793710wmH2.LLJILLL = false;
                    c1793710wmH2.LLJILJILJ = iMQuickReply2.content.text.text;
                    c1793710wmH2.LJI(false);
                    c1793710wmH2.LJII(false);
                    String string = c1793710wmH2.getContext().getString(2131830813);
                    String string2 = c1793710wmH2.getContext().getString(2131835471);
                    String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string2}, 1));
                    int iLJJJ = a0.LJJJ(strJ4, string2, 0, false, 6);
                    if (iLJJJ != -1) {
                        int length = string2.length() + iLJJJ;
                        SpannableString spannableString = new SpannableString(strJ4);
                        C786410Ut5.p2(spannableString, new C1785030wYH(c1793710wmH2.getContext(), iMQuickReply2, new AwS571S0100000_27(c1793710wmH2, 1111)), iLJJJ, length, 33);
                        c1793710wmH2.LLILZLL.setText(spannableString);
                    } else {
                        c1793710wmH2.LLILZLL.setText(strJ4);
                    }
                }
            }
        } else {
            this.LL.bS();
            C1793710wmH c1793710wmH3 = this.LL.LLJJ;
            if (c1793710wmH3 != null) {
                c1793710wmH3.LJII(true);
            }
            numLJ = null;
        }
        IMQuickReplyManageFragment iMQuickReplyManageFragment3 = this.LL;
        IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig2 = iMQuickReplyManageFragment3.LLJJIJIL;
        if (iMQuickReplyManagePageConfig2 == null || (str = iMQuickReplyManagePageConfig2.toUserId) == null) {
            str = "";
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C715350S4f(i, str, iMQuickReplyManageFragment3.getEnterFrom(), numLJ, this.LL.getEnterMethod(), null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.handleSaveResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
