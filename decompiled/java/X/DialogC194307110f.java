package X;

import Y.ACListenerS163S0100000_29;
import Y.ACListenerS52S0400000_16;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.110f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class DialogC194307110f extends DialogC1389100mFg {
    public final List<WikipediaInfo> LLJILJIL;
    public final Map<String, String> LLJILJILJ;
    public final Function1<WikipediaInfo, Unit> LLJILLL;
    public final Function0<Unit> LLJJ;

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.d1r);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tum);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        final List<WikipediaInfo> list = this.LLJILJIL;
        final Map<String, String> map = this.LLJILJILJ;
        final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 481);
        recyclerView.setAdapter(new AbstractC21673619ry<RecyclerView.ViewHolder>(list, map, awS608S0100000_29) { // from class: X.10vg
            public final List<WikipediaInfo> LL;
            public final C19415010xY<List<WikipediaInfo>> LLILLJJLI;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return this.LL.size();
            }

            @Override // X.AbstractC21673619ry
            public final int getItemViewType(int i) {
                if (i < this.LL.size()) {
                    return this.LLILLJJLI.LIZIZ(i, this.LL);
                }
                return super.getItemViewType(i);
            }

            @Override // X.AbstractC21673619ry
            public final void onAttachedToRecyclerView(RecyclerView recyclerView2) {
                super.onAttachedToRecyclerView(recyclerView2);
                this.LLILLJJLI.LIZJ();
            }

            @Override // X.AbstractC21673619ry
            public final void onDetachedFromRecyclerView(RecyclerView recyclerView2) {
                super.onDetachedFromRecyclerView(recyclerView2);
                this.LLILLJJLI.LJFF();
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                this.LLILLJJLI.LIZLLL(i, viewHolder, this.LL);
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                RecyclerView.ViewHolder viewHolderLJ = this.LLILLJJLI.LJ(viewGroup, i);
                try {
                    View view = viewHolderLJ.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                viewHolderLJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (viewHolderLJ.itemView.getParent() != null) {
                        boolean zLIZ = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (zLIZ) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(viewHolderLJ.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) viewHolderLJ.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(viewHolderLJ.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = viewHolderLJ.getClass().getName();
                return viewHolderLJ;
            }

            {
                this.LL = list;
                C19415010xY<List<WikipediaInfo>> c19415010xY = new C19415010xY<>();
                this.LLILLJJLI = c19415010xY;
                c19415010xY.LIZ(new AbstractC1067910dtd<List<? extends WikipediaInfo>>(map, awS608S0100000_29) { // from class: X.0dsW
                    public final Map<String, String> LIZ;
                    public final Function1<WikipediaInfo, Unit> LIZIZ;

                    @Override // X.AbstractC1067910dtd
                    public final RecyclerView.ViewHolder LIZJ(ViewGroup viewGroup) {
                        return new C1067230dsX(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d1q, viewGroup, false));
                    }

                    @Override // X.AbstractC1067910dtd
                    public final /* bridge */ /* synthetic */ void LIZ(Object obj) {
                    }

                    {
                        this.LIZ = map;
                        this.LIZIZ = awS608S0100000_29;
                    }

                    @Override // X.AbstractC1067910dtd
                    public final void LIZIZ(Object obj, int i, RecyclerView.ViewHolder viewHolder) {
                        List list2 = (List) obj;
                        if (viewHolder instanceof C1067230dsX) {
                            C1067230dsX c1067230dsX = (C1067230dsX) viewHolder;
                            WikipediaInfo wikipediaInfo = (WikipediaInfo) ListProtector.get(list2, i);
                            Map<String, String> map2 = this.LIZ;
                            Function1<WikipediaInfo, Unit> function1 = this.LIZIZ;
                            C786410Ut5.I7(new ACListenerS52S0400000_16(function1, wikipediaInfo, c1067230dsX, map2, 0), c1067230dsX.itemView);
                            c1067230dsX.LL.setText(wikipediaInfo.getKeyword());
                        }
                    }
                });
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
        if (this.LLJILJIL.size() > 7) {
            marginLayoutParams.height = (int) C12ES.LIZJ(422.0f, recyclerView.getContext());
        } else if (this.LLJILJIL.size() <= 4) {
            marginLayoutParams.height = (int) C12ES.LIZJ(250.0f, recyclerView.getContext());
            recyclerView.setPadding(0, 0, 0, 0);
        } else {
            marginLayoutParams.height = -2;
        }
        C786410Ut5.p6(recyclerView, marginLayoutParams);
        C786410Ut5.Q7((ImageView) findViewById(R.id.l8i), new ACListenerS163S0100000_29(this, 177));
        int iLJIIIIZZ = C12ES.LJIIIIZZ(getContext()) - C497820Jfg.LIZJ(getContext());
        Window window = getWindow();
        if (window != null) {
            if (iLJIIIIZZ == 0) {
                iLJIIIIZZ = -1;
            }
            window.setLayout(-1, iLJIIIIZZ);
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        setOnCancelListener(new C12YJ(this, 3));
    }

    public DialogC194307110f(Context context, List list, Map map, AwS608S0100000_29 awS608S0100000_29, AwS573S0100000_29 awS573S0100000_29) {
        super(context, R.style.ac4);
        this.LLJILJIL = list;
        this.LLJILJILJ = map;
        this.LLJILLL = awS608S0100000_29;
        this.LLJJ = awS573S0100000_29;
    }
}
