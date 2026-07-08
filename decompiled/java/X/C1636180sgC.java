package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0sgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1636180sgC extends AbstractViewOnClickListenerC1636290sgN {
    public final InterfaceC1635560sfC LLJI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int adapterPosition;
        DATA data = this.LL;
        if (data == 0 || -1 == (adapterPosition = getAdapterPosition())) {
            return;
        }
        Map<String, List<Integer>> mapLJJJLIIL = this.LLILZLL.LJJJLIIL();
        this.LLILZLL.LJJLL();
        Integer num = null;
        List<Integer> list = mapLJJJLIIL.get(null);
        int iIntValue = 0;
        if (list != null) {
            ListIterator<Integer> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Integer numPrevious = listIterator.previous();
                if (adapterPosition > numPrevious.intValue()) {
                    num = numPrevious;
                    break;
                }
            }
            Integer num2 = num;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
        }
        this.LLIZ.ax0(new C1629840sVy<>(data, adapterPosition - iIntValue, this.LLILLJJLI, false, false, null, null, null, null, 1008));
    }

    @Override // X.C1636260sgK
    public final void L5(int i, Object obj) {
        List<String> urlList;
        String str;
        Effect effect = (Effect) obj;
        this.LLILZIL.setText(effect.getName());
        TextView textView = this.LLILZIL.getTextView();
        if (C1625940sPg.LJIIL(this.LLILZLL, effect) && !C1624200sMs.LJIIIIZZ(effect)) {
            if (textView instanceof C1636840shG) {
                ((C1636840shG) textView).setMarqueeEnable(true);
            }
        } else if (textView instanceof C1636840shG) {
            ((C1636840shG) textView).setMarqueeEnable(false);
        }
        UrlModel iconUrl = effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
            C1637440siE.LIZ(this.LLILZIL, effect, str, null, null);
        }
        this.LLJI.LIZ(effect, new IIsTagNeedUpdatedListener() { // from class: X.0sgI
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedNotUpdate() {
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedUpdate() {
            }
        });
        this.itemView.setContentDescription(effect.getName());
    }

    @Override // X.AbstractViewOnClickListenerC1636290sgN, X.C1636260sgK
    public final /* bridge */ /* synthetic */ void N5(int i, EnumC1641420soe enumC1641420soe, Integer num, Object obj) {
        N5((Effect) obj, enumC1641420soe, num, i);
    }

    @Override // X.AbstractViewOnClickListenerC1636290sgN
    /* JADX INFO: renamed from: T5 */
    public final void N5(Effect effect, EnumC1641420soe enumC1641420soe, Integer num, int i) {
        V5(enumC1641420soe, num);
        InterfaceC1636220sgG interfaceC1636220sgG = this.LLJ;
        if (interfaceC1636220sgG != null && interfaceC1636220sgG.LIZ(this.LLILZLL.LLILIL(), effect)) {
            U5(true);
        } else {
            U5(false);
        }
    }

    public C1636180sgC(View view, C1662850tND c1662850tND, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi<Effect> interfaceC1631540sYi) {
        super(view, c1662850tND, interfaceC1624480sNK, interfaceC1631540sYi);
        this.LLJI = interfaceC1635560sfC;
    }
}
