package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.SwitchLiveModeChannel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Upi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784320Upi extends AbstractC21673619ry<C784340Upk> {
    public final DataChannel LL;
    public final Function0<Unit> LLILLJJLI;
    public final List<C784310Uph> LLILLL = new ArrayList();
    public int LLILZ = -1;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public C784320Upi(DataChannel dataChannel, C5182020e c5182020e) {
        this.LL = dataChannel;
        this.LLILLJJLI = c5182020e;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        String string;
        Object objGg0;
        Resources resources;
        String string2;
        Resources resources2;
        final C784340Upk c784340Upk = (C784340Upk) viewHolder;
        final C784310Uph c784310Uph = (C784310Uph) ListProtector.get(this.LLILLL, i);
        Context context = c784340Upk.itemView.getContext();
        c784340Upk.LLILLL.setIconAttr(c784310Uph.LIZJ);
        C16F5 c16f5 = c784340Upk.LL;
        String str = "";
        if (context == null || (resources2 = context.getResources()) == null || (string = resources2.getString(c784310Uph.LIZ)) == null) {
            string = "";
        }
        c16f5.setText(string);
        C16F5 c16f52 = c784340Upk.LLILLJJLI;
        if (context != null && (resources = context.getResources()) != null && (string2 = resources.getString(c784310Uph.LIZIZ)) != null) {
            str = string2;
        }
        c16f52.setText(str);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(LiveModeChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == c784310Uph.LIZLLL) {
            c784340Upk.LLILZ.setChecked(true);
            this.LLILZ = c784340Upk.getAdapterPosition();
        } else {
            c784340Upk.LLILZ.setChecked(false);
        }
        if (c784310Uph.LIZLLL == LiveMode.LIVE_VOICE) {
            RedDotExtensionKt.LJIILJJIL(C0UX6.LIVE_BROADCAST_PREVIEW_VOICE_CHAT, c784340Upk.LLILZIL, c784310Uph.LJ);
        }
        c784340Upk.LLILZ.setClickable(false);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Upj
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    C784320Upi c784320Upi = this.LLILZ;
                    if (c784320Upi.LLILZ == i) {
                        c784320Upi.LLILLJJLI.invoke();
                        return;
                    }
                    if (c784310Uph.LIZLLL == LiveMode.LIVE_VOICE && C500260Jjc.LJJJJIZL(c784340Upk.LLILZIL)) {
                        c784310Uph.LJ = false;
                        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_VOICE_CHAT);
                    }
                    DataChannel dataChannel2 = this.LLILZ.LL;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(SwitchLiveModeChannel.class, c784310Uph.LIZLLL);
                    }
                    C784320Upi c784320Upi2 = this.LLILZ;
                    c784320Upi2.notifyItemChanged(c784320Upi2.LLILZ);
                    this.LLILZ.notifyItemChanged(i);
                    this.LLILZ.LLILLJJLI.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, c784340Upk.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C784340Upk c784340Upk = new C784340Upk(C500260Jjc.LJIILL(R.layout.gu6, viewGroup, false));
        try {
            View view = c784340Upk.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c784340Upk.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c784340Upk.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C784340Upk.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c784340Upk.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c784340Upk.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C784340Upk.class.getName();
        return c784340Upk;
    }
}
