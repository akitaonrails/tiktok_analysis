package X;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Euy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379900Euy extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final RecyclerView LLILLJJLI;
    public final C380120EvK LLILLL;
    public final C379930Ev1 LLILZ;
    public final C0F3I LLILZIL;
    public C379890Eux LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0F3I, X.19ry] */
    public C379900Euy(View view) {
        super(view);
        this.LL = (TuxTextView) view.findViewById(R.id.atv);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.atu);
        this.LLILLJJLI = recyclerView;
        this.LLILLL = (C380120EvK) view.findViewById(R.id.h9g);
        this.LLILZ = (C379930Ev1) view.findViewById(R.id.h9h);
        ?? r3 = new AbstractC2172971A2l<String, C0F3J>() { // from class: X.0F3I
            {
                C0F3K c0f3k = new AbstractC339510DSr<String>() { // from class: X.0F3K
                    @Override // X.AbstractC339510DSr
                    public final boolean LIZ(String str, String str2) {
                        return Intrinsics.LJFF(str, str2);
                    }

                    @Override // X.AbstractC339510DSr
                    public final boolean LIZIZ(String str, String str2) {
                        return Intrinsics.LJFF(str, str2);
                    }
                };
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C0F3J c0f3j = (C0F3J) viewHolder;
                String strLLLFZ = LLLFZ(i);
                c0f3j.getClass();
                String string = a0.LJLIIIL(strLLLFZ).toString();
                if (string.length() == 0) {
                    C786410Ut5.LLFF(8, c0f3j.LL);
                    return;
                }
                C786410Ut5.LLFF(0, c0f3j.LL);
                Uri uriFromFile = UriProtector.parse(string);
                if (!Intrinsics.LJFF(uriFromFile.getScheme(), "content")) {
                    uriFromFile = Uri.fromFile(new C0VSJ(string));
                }
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriFromFile);
                c1331670kl3LJI.LJJIJL(c0f3j.itemView.getContext());
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C418440Gaw.LIZIZ(4);
                c1331670kl3LJI.LJJI = c1331750klB.LIZ();
                c1331670kl3LJI.LJJI(c0f3j.LL);
                C786410Ut5.h3(c1331670kl3LJI);
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C0F3J c0f3j = new C0F3J(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bzk, viewGroup, false));
                try {
                    View view2 = c0f3j.itemView;
                    if (view2 != null) {
                        view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c0f3j.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c0f3j.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C0F3J.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c0f3j.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c0f3j.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C0F3J.class.getName();
                return c0f3j;
            }
        };
        this.LLILZIL = r3;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
        recyclerView.setAdapter(r3);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(false);
        recyclerView.setNestedScrollingEnabled(false);
    }
}
