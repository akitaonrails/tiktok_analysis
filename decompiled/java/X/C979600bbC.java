package X;

import Y.AObserverS219S0100000_15;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979600bbC extends C0J8P<C977980bYa, C979580bbA> {
    public final LifecycleOwner LIZIZ;
    public final C977620bY0 LIZJ;
    public final boolean LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final InterfaceC963450bB9 LJI;
    public final DataChannel LJII;
    public C979580bbA LJIIIIZZ;

    public C979600bbC(C979750bbR c979750bbR, LifecycleOwner lifecycleOwner) {
        this.LIZIZ = lifecycleOwner;
        C977620bY0 c977620bY0 = c979750bbR.LIZIZ;
        this.LIZJ = c977620bY0;
        this.LIZLLL = c979750bbR.LIZ;
        this.LJ = c979750bbR.LIZJ;
        this.LJFF = c979750bbR.LIZLLL;
        this.LJI = c979750bbR.LJ;
        this.LJII = c979750bbR.LJFF;
        if (c977620bY0 != null) {
            c977620bY0.LJIILJJIL.observe(this.LIZIZ, new AObserverS219S0100000_15(this, 103));
        }
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C977980bYa c977980bYa) {
        MutableLiveData mutableLiveData;
        List list;
        ImageModel imageModel;
        C754570Tip c754570Tip;
        C754570Tip c754570Tip2;
        C979580bbA c979580bbA = (C979580bbA) viewHolder;
        C977620bY0 c977620bY0 = c979580bbA.LLILZ.LIZJ;
        ImageModel imageModel2 = null;
        if (c977620bY0 != null && (mutableLiveData = c977620bY0.LIZJ) != null && (list = (List) mutableLiveData.getValue()) != null && (!list.isEmpty())) {
            C954460awe c954460awe = (C954460awe) C13LP.LJJJLZIJ(0, list);
            if (c954460awe != null && (c754570Tip2 = c954460awe.LJIJJ) != null) {
                imageModel = c754570Tip2.LIZJ;
            } else {
                imageModel = null;
            }
            C979580bbA.I5(imageModel, c979580bbA.LL);
            C954460awe c954460awe2 = (C954460awe) C13LP.LJJJLZIJ(1, list);
            if (c954460awe2 != null && (c754570Tip = c954460awe2.LJIJJ) != null) {
                imageModel2 = c754570Tip.LIZJ;
            }
            C979580bbA.I5(imageModel2, c979580bbA.LLILLJJLI);
        }
        c979580bbA.L5();
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C979580bbA c979580bbA = new C979580bbA(this, C786410Ut5.Td(layoutInflater, R.layout.h86, viewGroup, false));
        this.LJIIIIZZ = c979580bbA;
        return c979580bbA;
    }
}
