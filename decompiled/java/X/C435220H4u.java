package X;

import Y.ACListenerS74S0300000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435220H4u extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final int LLILLL;
    public final SubscriptionPrivilegeDetailFragment LLILZ;
    public PopupWindow LLIZ;
    public final /* synthetic */ C0K1D LLJ;
    public boolean LLILLJJLI = true;
    public final int LLILZIL = 5;
    public final List<EmoteModel> LLILZLL = new ArrayList();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1102));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI ? this.LLILZIL : ((ArrayList) this.LLILZLL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((C0H4F) viewHolder).I5(i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.fg3, viewGroup, false);
        C0H4F c0h4f = new C0H4F(viewTd) { // from class: X.0K17
            public final C417410GYh LL;

            @Override // X.C0H4F
            public final void I5(int i2) {
                Object obj;
                Object c098200Yq;
                C0K77 c0k77C3;
                List<String> listLIZ;
                EmoteModel emoteModel = (EmoteModel) C13LP.LJJJLZIJ(i2, this.LLILLJJLI.LLILZLL);
                C417410GYh c417410GYh = this.LL;
                if (c417410GYh != null && emoteModel != null) {
                    C0K1F c0k1f = (C0K1F) this.LLILLJJLI.LLIZLLLIL.getValue();
                    if (c0k1f != null) {
                        C19719612Di.LJJIIJ(c0k1f.LIZIZ, new C5183020f(emoteModel, 235), true);
                        ((ArrayList) c0k1f.LIZIZ).add(emoteModel);
                    }
                    if (!C842240X2g.LIZ(emoteModel.image).isEmpty()) {
                        C0K4T c0k4t = C511420K3w.LJIIJ;
                        ImageModel imageModel = emoteModel.image;
                        boolean zLJJJI = false;
                        if (imageModel != null && (listLIZ = C842240X2g.LIZ(imageModel)) != null) {
                            obj = ListProtector.get(listLIZ, 0);
                        } else {
                            obj = null;
                        }
                        String strValueOf = String.valueOf(obj);
                        c0k4t.getClass();
                        try {
                            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                            if (iLiveOuterService != null && (c0k77C3 = iLiveOuterService.C3()) != null) {
                                zLJJJI = c0k77C3.LJJJI(strValueOf);
                            }
                            c098200Yq = Boolean.valueOf(zLJJJI);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Boolean bool = Boolean.FALSE;
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = bool;
                        }
                        ((Boolean) c098200Yq).booleanValue();
                    }
                    C511420K3w.LJIIJ.getClass();
                    C511420K3w c511420K3w = new C511420K3w();
                    c511420K3w.LIZ = emoteModel.image;
                    c511420K3w.LJII = Boolean.TRUE;
                    c511420K3w.LIZ(c417410GYh);
                    C786410Ut5.Ca(c417410GYh, new ACListenerS74S0300000_7(this.LLILLJJLI, c417410GYh, emoteModel, 5));
                }
            }

            {
                super(viewTd);
                this.LL = (C417410GYh) viewTd.findViewById(R.id.h1i);
            }
        };
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        int i2 = this.LLILLL;
        layoutParams.width = i2;
        layoutParams.height = i2;
        C786410Ut5.W5(viewTd, layoutParams);
        try {
            View view = c0h4f.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h4f.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h4f.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0K17.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h4f.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h4f.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0K17.class.getName();
        return c0h4f;
    }

    public C435220H4u(C0K1D c0k1d, Context context, int i, SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        this.LLJ = c0k1d;
        this.LL = context;
        this.LLILLL = i;
        this.LLILZ = subscriptionPrivilegeDetailFragment;
    }
}
