package X;

import X.AbstractC450910HmD;
import X.C2157308cl;
import X.C487280J9a;
import Y.ARunnableS106S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0HmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC450910HmD<T> extends AbstractC683590Qrd<T> implements InterfaceC487330J9f {
    public final Context LL;
    public final int LLILLJJLI;
    public RecyclerView LLILLL;
    public InterfaceC450890HmB LLILZ;

    public abstract int LLLII();

    public abstract int LLLIILIL();

    public final InterfaceC450890HmB LLLI() {
        InterfaceC450890HmB interfaceC450890HmB = this.LLILZ;
        if (interfaceC450890HmB != null) {
            return interfaceC450890HmB;
        }
        return null;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr, X.AbstractC21673619ry
    public final int getItemCount() {
        return this.mShowFooter ? getBasicItemCount() + 1 : getBasicItemCount();
    }

    public void LLLIIIIL(RecyclerView recyclerView) {
        this.LLILLL = recyclerView;
        Activity activityLIZ = C1388190mED.LIZ(recyclerView.getContext());
        if (activityLIZ != null) {
            C487280J9a.LIZ(activityLIZ.hashCode(), this);
        }
    }

    public AbstractC450910HmD(Context context, final LifecycleOwner lifecycleOwner) {
        super(false);
        this.LL = context;
        this.LLILLJJLI = 7;
        this.mShowFooter = false;
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver(this) { // from class: com.ss.android.ugc.aweme.emoji.common.emojipagev2.BaseEmojiGridAdapter$1
            public final /* synthetic */ AbstractC450910HmD<Object> LL;

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                C487280J9a.LIZJ(this.LL);
                if (C2157308cl.LIZ()) {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }

            {
                this.LL = this;
            }
        });
    }

    @Override // X.InterfaceC487330J9f
    public void onConfigurationChanged(Activity activity, Configuration configuration) {
        RecyclerView recyclerView = this.LLILLL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS106S0100000_6(this, 270));
        }
    }

    @Override // X.AbstractC438050HFr
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new C450970HmJ(C786410Ut5.Td(C786410Ut5.ne(this.LL), LLLII(), viewGroup, false));
    }

    public final int LLLFZ(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = C12ES.LJIIJ(this.LL);
        }
        return (int) ((((((double) i) - (((double) i3) * 2.0d)) - ((double) (i2 * i4))) * ((double) 1.0f)) / ((double) (i4 - 1)));
    }
}
