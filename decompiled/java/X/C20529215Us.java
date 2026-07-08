package X;

import Y.ARunnableS0S4102000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15Us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20529215Us extends AbstractC21673619ry<C20529315Ut> {
    public final FragmentManager LL;
    public boolean LLILZ;
    public int LLILZLL;
    public volatile boolean LLIZ;
    public final int LLILLJJLI = 4;
    public final List<ExploreCustomTopicStruct> LLILLL = new ArrayList();
    public String LLILZIL = "left";

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI;
    }

    public C20529215Us(FragmentManager fragmentManager) {
        this.LL = fragmentManager;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C20529315Ut c20529315Ut = (C20529315Ut) viewHolder;
        c20529315Ut.LLILLJJLI.setText(((ExploreCustomTopicStruct) ListProtector.get(this.LLILLL, i)).topicName);
        C2211751BhN.LIZ(c20529315Ut.itemView, new AbstractC2211791BhR(c20529315Ut, this) { // from class: X.15Uv
            public final C20529115Ur LJ;
            public final C15V1 LJFF;
            public Function0<String> LJI;

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return 0;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return (float) ((Number) C282030B3p.LIZ.getValue()).doubleValue();
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211921Bhe LJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJI = function0;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.15Ur] */
            /* JADX WARN: Type inference failed for: r0v1, types: [X.15V1] */
            {
                this.LJ = new InterfaceC2211931Bhf() { // from class: X.15Ur
                    @Override // X.InterfaceC2211931Bhf
                    public final void LIZ(View view, String str) {
                        String string;
                        Context context;
                        ExploreCustomTopicStruct exploreCustomTopicStructI5 = c20529315Ut.I5();
                        if (exploreCustomTopicStructI5 == null) {
                            return;
                        }
                        C15TA c15ta = C15TA.LIZ;
                        String str2 = exploreCustomTopicStructI5.topicName;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        Long l = exploreCustomTopicStructI5.topicId;
                        if (l == null || (string = l.toString()) == null) {
                            string = "";
                        }
                        int bindingAdapterPosition = c20529315Ut.getBindingAdapterPosition();
                        C20529215Us c20529215Us = this;
                        String str4 = c20529215Us.LLILZIL;
                        int i2 = c20529215Us.LLILZLL;
                        Boolean boolValueOf = Boolean.valueOf(c20529215Us.LLILZ);
                        String str5 = exploreCustomTopicStructI5.requestId;
                        if (str5 != null) {
                            str3 = str5;
                        }
                        c15ta.getClass();
                        C15TA.LJIILL(new ARunnableS0S4102000_11(string, str2, bindingAdapterPosition, str4, i2, boolValueOf, str3, 1));
                        C20529315Ut c20529315Ut2 = c20529315Ut;
                        if (view != null) {
                            context = view.getContext();
                        } else {
                            context = null;
                        }
                        Long l2 = exploreCustomTopicStructI5.topicId;
                        String str6 = exploreCustomTopicStructI5.topicName;
                        c20529315Ut2.getClass();
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20525315Tf(c20529315Ut2, l2, str6, context, null), 3);
                    }
                };
                this.LJFF = new InterfaceC2211921Bhe() { // from class: X.15V1
                    @Override // X.InterfaceC2211921Bhe
                    public final void LIZ(long j) {
                        C15TU c15tu = c20529315Ut.LLILLL;
                        if (c15tu != null) {
                            c15tu.release();
                        }
                    }
                };
                this.LJI = new AwS575S0100000_31(c20529315Ut, 1632);
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C2493709pv c2493709pv = C2493709pv.LIZ;
        Context context = viewGroup.getContext();
        c2493709pv.getClass();
        C20529315Ut c20529315Ut = new C20529315Ut(this, C2493709pv.LIZ(context, R.layout.c5k, viewGroup));
        try {
            View view = c20529315Ut.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c20529315Ut.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c20529315Ut.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C20529315Ut.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c20529315Ut.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c20529315Ut.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C20529315Ut.class.getName();
        return c20529315Ut;
    }
}
