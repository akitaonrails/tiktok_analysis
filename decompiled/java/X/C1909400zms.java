package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("praise_guide_dialog")
public final class C1909400zms extends AbstractC20660015ss<TuxSheet> {
    public final AbstractC1909290zmh LL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 510;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        Activity activity = this.LL.LIZ;
        if (activity instanceof LifecycleOwner) {
            return new C688120Qyw(activity, (LifecycleOwner) activity, null);
        }
        return null;
    }

    public C1909400zms(AbstractC1909290zmh abstractC1909290zmh) {
        this.LL = abstractC1909290zmh;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        this.LL.LJFF();
        AbstractC1909290zmh abstractC1909290zmh = this.LL;
        C1909410zmt c1909410zmt = new C1909410zmt(abstractC1909290zmh.LIZ, abstractC1909290zmh);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZLLL(R.style.xm, false);
        c1390920mIc.LIZ.LLJJIII = c1909410zmt;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLL = false;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS429S0200000_28(this, c1909410zmt, 139));
        c0om1.LIZIZ(c1251150ifB);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIL = c0om1;
        tuxSheet2.LLJJJ = null;
        tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0zmv
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        };
        Activity activity = this.LL.LIZ;
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            tuxSheet2.show(supportFragmentManager, "praise_dialog");
        }
        return tuxSheet2;
    }
}
