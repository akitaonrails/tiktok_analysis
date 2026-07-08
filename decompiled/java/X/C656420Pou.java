package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Pou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656420Pou extends AbstractC656440Pow {
    public final Context LLILZ;
    public final InterfaceC656470Poz LLILZIL;
    public final InterfaceC656470Poz LLILZLL;
    public final InterfaceC641090PCp LLIZ;
    public final C652990PjN LLIZLLLIL;
    public final InterfaceC661680PxO LLJ;
    public C653660PkS LLJI;
    public String LLJIJIL;
    public final C653120Pja<Aweme> LLJILJIL;
    public List<? extends Aweme> LLJILJILJ;

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (this.LLJILJILJ.size() != 1) {
            return this.LLJILJILJ.size();
        }
        return 1;
    }

    @Override // X.AbstractC656440Pow
    public final List<Aweme> LLLFZ() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            this.LLILZLL.LIZ(bindingAdapterPosition, (Aweme) ListProtector.get(this.LLJILJILJ, bindingAdapterPosition));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b5  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r25v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r26v0, types: [X.18s1] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C656420Pou.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = ViewOnAttachStateChangeListenerC656430Pov.LLJJJJLIIL;
        InterfaceC641090PCp interfaceC641090PCp = this.LLIZ;
        C652990PjN c652990PjN = this.LLIZLLLIL;
        InterfaceC661680PxO interfaceC661680PxO = this.LLJ;
        C650520PfO.LIZ.getClass();
        ViewOnAttachStateChangeListenerC656430Pov viewOnAttachStateChangeListenerC656430Pov = new ViewOnAttachStateChangeListenerC656430Pov(C650520PfO.LIZ(R.layout.eth, viewGroup), interfaceC641090PCp, c652990PjN, this, viewGroup, interfaceC661680PxO);
        viewOnAttachStateChangeListenerC656430Pov.LLJIJIL = this.LLILZIL;
        try {
            View view = viewOnAttachStateChangeListenerC656430Pov.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewOnAttachStateChangeListenerC656430Pov.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewOnAttachStateChangeListenerC656430Pov.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ViewOnAttachStateChangeListenerC656430Pov.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewOnAttachStateChangeListenerC656430Pov.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewOnAttachStateChangeListenerC656430Pov.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = ViewOnAttachStateChangeListenerC656430Pov.class.getName();
        return viewOnAttachStateChangeListenerC656430Pov;
    }

    public C656420Pou(Context context, C652890PjD c652890PjD, C652890PjD c652890PjD2, InterfaceC641090PCp interfaceC641090PCp, C652990PjN c652990PjN, RecyclerView recyclerView, InterfaceC661680PxO interfaceC661680PxO) {
        super(recyclerView);
        this.LLILZ = context;
        this.LLILZIL = c652890PjD;
        this.LLILZLL = c652890PjD2;
        this.LLIZ = interfaceC641090PCp;
        this.LLIZLLLIL = c652990PjN;
        this.LLJ = interfaceC661680PxO;
        this.LLJI = new C653660PkS();
        this.LLJIJIL = "";
        this.LLJILJIL = new C653120Pja<>(recyclerView);
        this.LLJILJILJ = new ArrayList();
    }
}
