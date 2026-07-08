package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicAdminAuthorizationLinkOptSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Tao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C749600Tao extends AbstractC21673619ry<AbstractC749630Tar> {
    public final DataChannel LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public List<C750740Tce> LLILZLL = new ArrayList();
    public final List<C750740Tce> LLIZ = new ArrayList();
    public Function1<? super Boolean, Unit> LLIZLLLIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZLL.size();
    }

    public final void LLLFZ(String str) {
        Boolean boolValueOf;
        List<C750740Tce> list = this.LLIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            C750740Tce c750740Tce = (C750740Tce) obj;
            String str2 = c750740Tce.LIZJ;
            Boolean boolValueOf2 = null;
            if (str2 != null) {
                boolValueOf = Boolean.valueOf(a0.LJJIIZI(str2, str, true));
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJJI(boolValueOf)) {
                String str3 = c750740Tce.LIZLLL;
                if (str3 != null) {
                    boolValueOf2 = Boolean.valueOf(a0.LJJIIZI(str3, str, true));
                }
                if (C500260Jjc.LJJJI(boolValueOf2)) {
                }
            }
            arrayList.add(obj);
        }
        this.LLILZLL = new ArrayList(arrayList);
        notifyDataSetChanged();
        Function1<? super Boolean, Unit> function1 = this.LLIZLLLIL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(((ArrayList) this.LLILZLL).isEmpty()));
        }
    }

    public final void LLLI(long j) {
        C750740Tce c750740Tce = null;
        for (C750740Tce c750740Tce2 : (ArrayList) this.LLIZ) {
            if (c750740Tce2.LIZ == j) {
                c750740Tce = c750740Tce2;
            }
        }
        if (c750740Tce != null) {
            ((ArrayList) this.LLIZ).remove(c750740Tce);
            ((ArrayList) this.LLILZLL).remove(c750740Tce);
            notifyDataSetChanged();
        }
    }

    public final void setData(List<C750740Tce> list) {
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (C750740Tce c750740Tce : list) {
            C750740Tce c750740Tce2 = c750740Tce;
            if (c750740Tce2.LIZ != this.LLILLL && C500260Jjc.LJJIFFI(Boolean.valueOf(c750740Tce2.LJIIIIZZ))) {
                arrayList.add(c750740Tce);
            }
        }
        ((ArrayList) this.LLIZ).clear();
        ((ArrayList) this.LLIZ).addAll(arrayList);
        this.LLILZLL.clear();
        this.LLILZLL.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC749630Tar) viewHolder).V2(ListProtector.get(this.LLILZLL, i));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c750400Tc6;
        if (Intrinsics.LJFF(this.LLILLJJLI, "moderator_panel") && this.LLILZIL && LinkMicAdminAuthorizationLinkOptSetting.INSTANCE.enable()) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gp_, viewGroup, false);
            DataChannel dataChannel = this.LL;
            c750400Tc6 = new C750380Tc4(viewTd, dataChannel, C500260Jjc.LJJLIIIJ(dataChannel));
        } else {
            View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gp8, viewGroup, false);
            DataChannel dataChannel2 = this.LL;
            c750400Tc6 = new C750400Tc6(dataChannel2, viewTd2, this.LLILLJJLI, this.LLILLL, C500260Jjc.LJJLIIIJ(dataChannel2), this.LLILZ, this.LLIZ, this.LLILZIL);
        }
        try {
            View view = c750400Tc6.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c750400Tc6.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c750400Tc6.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c750400Tc6.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c750400Tc6.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c750400Tc6.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c750400Tc6.getClass().getName();
        return c750400Tc6;
    }

    public C749600Tao(long j, DataChannel dataChannel, String str, boolean z, boolean z2) {
        this.LL = dataChannel;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }
}
