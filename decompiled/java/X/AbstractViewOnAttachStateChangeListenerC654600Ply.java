package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Ply, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractViewOnAttachStateChangeListenerC654600Ply extends RecyclerView.ViewHolder implements C0PT8, View.OnAttachStateChangeListener, InterfaceC645410PTf {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LL;
    public final C654620Pm0 LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public boolean LLILZIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(AbstractViewOnAttachStateChangeListenerC654600Ply.class, "_itemMobParam", "get_itemMobParam()Lcom/ss/android/ugc/aweme/search/mob/ItemMobParam;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // X.C0PT8
    public final void I2(ISearchContextAbility iSearchContextAbility) {
    }

    public void N5() {
    }

    public final Context getContext() {
        return this.itemView.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0PT8
    public final C653660PkS l3() {
        C654620Pm0 c654620Pm0 = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        C653660PkS c653660PkS = (C653660PkS) c654620Pm0.LL;
        return c653660PkS == null ? C660870Pw5.LIZ(this.itemView) : c653660PkS;
    }

    public C19EG L5() {
        Context context = getView().getContext();
        return (C19EG) (context != null ? C1388190mED.LIZ(context) : null);
    }

    public View getView() {
        return this.itemView;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Pm0] */
    public AbstractViewOnAttachStateChangeListenerC654600Ply(View view) {
        super(view);
        view.addOnAttachStateChangeListener(this);
        this.LL = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1299));
        this.LLILLJJLI = new C0NTU<C653660PkS>() { // from class: X.0Pm0
            {
                super(null);
            }

            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String imprId;
                LogPbBean logPbBean;
                LogPbBean logPbBean2;
                C653660PkS c653660PkS = (C653660PkS) obj2;
                C653660PkS c653660PkS2 = (C653660PkS) obj;
                String imprId2 = null;
                if (c653660PkS2 != null && (logPbBean2 = c653660PkS2.LJIILIIL) != null) {
                    imprId = logPbBean2.getImprId();
                } else {
                    imprId = null;
                }
                if (c653660PkS != null && (logPbBean = c653660PkS.LJIILIIL) != null) {
                    imprId2 = logPbBean.getImprId();
                }
                if (!u.LJIJI(imprId, imprId2, false)) {
                    this.LLILLJJLI.getClass();
                    this.LLILLJJLI.N5();
                }
            }
        };
    }

    @Override // X.C0PT8
    public void LLLIL(C653660PkS c653660PkS) {
        setValue(this, LLILZLL[0], c653660PkS);
        C660870Pw5.LIZIZ(this.itemView, l3());
    }

    @Override // X.InterfaceC645410PTf
    public final void LLLJIL(String str) {
        this.LLILZ = str;
    }

    public void onViewAttachedToWindow(View view) {
        C660870Pw5.LIZIZ(this.itemView, l3());
        this.LLILLL = true;
    }

    public void onViewDetachedFromWindow(View view) {
        C660870Pw5.LIZJ(this.itemView);
        C666560QCo.LIZIZ(null);
        this.LLILLL = false;
    }

    public final void I5(View view, final View view2, final C683220Qr2 c683220Qr2, View.OnTouchListener onTouchListener) {
        final Context context = view.getContext();
        AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0Plz
            @Override // X.AbstractViewOnTouchListenerC446430Hez
            public final void LIZ(boolean z) {
                ColorDrawable colorDrawable;
                int iIntValue;
                View view3 = view2;
                if (view3 != null) {
                    if (z) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        colorDrawable = new ColorDrawable(iIntValue);
                    } else {
                        colorDrawable = null;
                    }
                    view3.setBackground(colorDrawable);
                }
            }
        };
        if (this.LLILZIL) {
            abstractViewOnTouchListenerC446430Hez.LLIZ = new InterfaceC446420Hey() { // from class: X.0Pm2
                @Override // X.InterfaceC446420Hey
                public final void LIZ() {
                    boolean z = C0Q9J.LIZ;
                    C684120QsU.LIZIZ(this.LIZ.itemView, c683220Qr2, false, null, null, 28);
                }
            };
        }
        abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = onTouchListener;
        view.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
    }
}
