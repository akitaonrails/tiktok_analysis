package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0UCI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCI extends FrameLayout {
    public String LL;
    public final C0UCJ LLILLJJLI;
    public final RecyclerView LLILLL;

    public final void LIZ() {
        C500260Jjc.LJIILIIL(this);
        DataChannelGlobal.LLILZ.JQ2(C931050aKt.class, null);
        C0UCJ c0ucj = this.LLILLJJLI;
        c0ucj.LLILZ = null;
        c0ucj.LLILZIL = null;
    }

    public C0UCI(Context context) {
        super(context, null, 0);
        String str = C0UD4.LIZIZ;
        this.LL = str;
        C0UCJ c0ucj = new C0UCJ(str);
        this.LLILLJJLI = c0ucj;
        FrameLayout.inflate(context, R.layout.hmy, this);
        findViewById(R.id.trr).getBackground().setAlpha(255);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.m9i);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(c0ucj);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.LLILLL = recyclerView;
    }

    public final void LIZIZ(LiveEffect liveEffect) {
        LiveEffect liveEffect2;
        List<LiveEffect> listLL;
        LiveEffect liveEffect3;
        int i;
        if ((C767250U7v.LIZLLL(liveEffect) || (liveEffect != null && C767250U7v.LJ(liveEffect))) && (liveEffect2 = (LiveEffect) DataChannelGlobal.LLILZ.gg0(C931050aKt.class)) != null && (listLL = liveEffect2.LL()) != null && (!listLL.isEmpty())) {
            C0UCJ c0ucj = this.LLILLJJLI;
            if (C767250U7v.LIZLLL(liveEffect)) {
                liveEffect3 = (LiveEffect) ListProtector.get(listLL, 0);
            } else {
                liveEffect3 = liveEffect;
            }
            c0ucj.LLILZ = liveEffect3;
            C0UCJ c0ucj2 = this.LLILLJJLI;
            ((ArrayList) c0ucj2.LLILZLL).clear();
            ((ArrayList) c0ucj2.LLILZLL).addAll(listLL);
            c0ucj2.notifyDataSetChanged();
            C0UCJ c0ucj3 = this.LLILLJJLI;
            if (liveEffect == null) {
                c0ucj3.getClass();
            } else {
                Iterator it2 = ((ArrayList) c0ucj3.LLILZLL).iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((LiveEffect) it2.next()).getEffectId() == liveEffect.getEffectId()) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() >= 0) {
                int iIntValue = numValueOf.intValue();
                RecyclerView recyclerView = this.LLILLL;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(iIntValue);
                }
            }
        }
    }

    public final void setComposerManager(InterfaceC769000UEo interfaceC769000UEo) {
        this.LLILLJJLI.LLILLL = interfaceC769000UEo;
    }
}
