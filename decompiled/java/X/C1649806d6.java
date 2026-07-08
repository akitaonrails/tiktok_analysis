package X;

import Y.AObserverS206S0100000_2;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS403S0200000_2;

/* JADX INFO: renamed from: X.06d6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1649806d6 extends AbstractC1643906c9<C06OO, C1650006d8> {
    public final LifecycleOwner LLILZLL;
    public final SessionInfo LLIZ;
    public final MutableLiveData<Integer> LLIZLLLIL;
    public final AObserverS206S0100000_2 LLJ;

    @Override // X.C06OD
    public final void LIZLLL() {
        C1650006d8 c1650006d8 = (C1650006d8) this.LLILZIL;
        if (c1650006d8 != null) {
            C786410Ut5.LJLLLLLL(8, c1650006d8);
            c1650006d8.LLZLI();
        }
    }

    @Override // X.AbstractC1643906c9, X.C06OD
    public final void LJ(C06OO c06oo) {
        long jLongValue;
        super.LJ(c06oo);
        C0Z5O c0z5o = C0Z5O.LIZ;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLIZ.getConversationId());
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        c0z5o.LIZIZ(jLongValue, this.LLIZLLLIL);
        this.LLIZLLLIL.removeObserver(this.LLJ);
    }

    @Override // X.C06OD
    public final Object LJI(C06OO c06oo) {
        V v = this.LLILZIL;
        int iIntValue = 0;
        if (v != 0 && v.getVisibility() == 0) {
            return this.LLILZIL;
        }
        C1650006d8 c1650006d8 = (C1650006d8) this.LLILZIL;
        if (c1650006d8 != null) {
            c1650006d8.setBackground(null);
            C786410Ut5.LJLLLLLL(0, c1650006d8);
            Integer value = this.LLIZLLLIL.getValue();
            if (value != null) {
                iIntValue = value.intValue();
            }
            c1650006d8.LJIIIIZZ(new C1649906d7(iIntValue), new AwS403S0200000_2(c1650006d8, this, 65));
        }
        return this.LLILZIL;
    }

    @Override // X.C06OD
    public final Object LJII(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        Integer value = this.LLIZLLLIL.getValue();
        boolean z = false;
        if (value != null && value.intValue() > 0 && C0Z58.LIZ.LJIIJJI(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLIZ.getConversationId()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public C1649806d6(LifecycleOwner lifecycleOwner, C913140Zs0 c913140Zs0, ViewGroup viewGroup) {
        long jLongValue;
        super(EnumC1596306Mv.GROUP_UNREAD_JOIN_REQUEST, viewGroup, R.layout.cjr);
        this.LLILZLL = lifecycleOwner;
        this.LLIZ = c913140Zs0;
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = new AObserverS206S0100000_2(this, 14);
        C0Z5O c0z5o = C0Z5O.LIZ;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c913140Zs0.getConversationId());
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        c0z5o.LIZ(jLongValue, this.LLIZLLLIL);
        this.LLIZLLLIL.observe(this.LLILZLL, this.LLJ);
    }
}
