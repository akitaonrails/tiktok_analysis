package X;

import Y.ACListenerS116S0200000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdk.dataChannel.BeforeStickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UCJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCJ extends AbstractC21673619ry<C0UCP> {
    public String LL;
    public WeakReference<DataChannel> LLILLJJLI;
    public InterfaceC769000UEo LLILLL;
    public LiveEffect LLILZ;
    public LiveEffect LLILZIL;
    public final List<LiveEffect> LLILZLL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZLL).size();
    }

    public C0UCJ(String str) {
        this.LL = str;
    }

    public final void LLLFZ(LiveEffect liveEffect) {
        WeakReference<DataChannel> weakReference;
        DataChannel dataChannel;
        if (!Intrinsics.LJFF(this.LL, C0UD4.LJ) && (weakReference = this.LLILLJJLI) != null && (dataChannel = weakReference.get()) != null) {
            dataChannel.LC0(BeforeStickerSelectedEvent.class, new C0UCF(liveEffect, this.LL, "", C500260Jjc.LJIL()));
        }
    }

    public final void LLLI(LiveEffect liveEffect) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (Intrinsics.LJFF(this.LL, C0UD4.LJ)) {
            C0UC5 c0uc5 = C0UC5.LIZ;
            WeakReference<DataChannel> weakReference = this.LLILLJJLI;
            if (weakReference != null) {
                dataChannel2 = weakReference.get();
            } else {
                dataChannel2 = null;
            }
            c0uc5.LIZJ(liveEffect, dataChannel2, 0, false, null);
            return;
        }
        WeakReference<DataChannel> weakReference2 = this.LLILLJJLI;
        if (weakReference2 == null || (dataChannel = weakReference2.get()) == null) {
            return;
        }
        dataChannel.LC0(StickerSelectedEvent.class, new C0UCF(liveEffect, this.LL, "", C500260Jjc.LJIL()));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<String> list;
        C0UCP c0ucp = (C0UCP) viewHolder;
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LLILZLL, i);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        UrlModel icon = liveEffect.getIcon();
        if (icon != null) {
            list = icon.urlList;
        } else {
            list = null;
        }
        c0jbnLIZ.LIZJ(list).LJJI(c0ucp.LL);
        if (Intrinsics.LJFF(this.LLILZ, liveEffect)) {
            C500260Jjc.LLFFF(c0ucp.LLILLJJLI);
        } else {
            C500260Jjc.LJIILIIL(c0ucp.LLILLJJLI);
        }
        C786410Ut5.I7(new ACListenerS116S0200000_12(this, liveEffect, 48), c0ucp.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0UCP c0ucp = new C0UCP(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fyc, viewGroup, false));
        try {
            View view = c0ucp.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ucp.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ucp.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0UCP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ucp.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ucp.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0UCP.class.getName();
        return c0ucp;
    }
}
