package X;

import Y.AfS159S0200000_25;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.protocol.ICreateTabFillScreenAdapter;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0tRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665620tRg extends AbstractC21673619ry<C1637210shr> implements ICreateTabFillScreenAdapter {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C11PQ<Boolean> LL;
    public EnumC339730DTn LLILLJJLI;
    public final InterfaceC1665660tRk LLILLL;
    public final C11NJ LLILZ = new C11NJ();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1032));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return R.layout.c3f;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.protocol.ICreateTabFillScreenAdapter
    public final ICreateTabFillScreenAdapter.FakeEffect getItem() {
        return (ICreateTabFillScreenAdapter.FakeEffect) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.protocol.ICreateTabFillScreenAdapter
    public final ICreateTabFillScreenAdapter LLJJJIL(Map<String, String> map) {
        Iterator<C1636960shS> it2 = ((ICreateTabFillScreenAdapter.FakeEffect) this.LLILZIL.getValue()).getShowParamsList().iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ.putAll(map);
        }
        return this;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1637210shr c1637210shr = (C1637210shr) viewHolder;
        super.onViewAttachedToWindow(c1637210shr);
        this.LLILZ.LIZ(this.LL.LJJLJLI(new AfS159S0200000_25(this, c1637210shr, 16)));
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        this.LLILZ.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFZ(X.InterfaceC1680500tpg r16, int r17) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665620tRg.LLLFZ(X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLI(X.InterfaceC1680500tpg r22, int r23) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665620tRg.LLLI(X.0tpg, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1669670tYD.LJ(((C1637210shr) viewHolder).LL, EnumC1427810nG7.Dark, new C19719212De(-1824316672, new AwS639S0100000_25(this, 141), true));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1637210shr c1637210shr = new C1637210shr(new ComposeView(viewGroup.getContext(), null, 6));
        try {
            View view = c1637210shr.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1637210shr.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1637210shr.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1637210shr.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1637210shr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1637210shr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1637210shr.class.getName();
        return c1637210shr;
    }

    public C1665620tRg(C11PQ c11pq, EnumC339730DTn enumC339730DTn, C318730CeV c318730CeV) {
        this.LL = c11pq;
        this.LLILLJJLI = enumC339730DTn;
        this.LLILLL = c318730CeV;
    }
}
