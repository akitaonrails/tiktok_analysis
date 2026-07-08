package X;

import Y.ACListenerS152S0100000_17;
import Y.ACListenerS83S0300000_17;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0fr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143190fr3 extends FrameLayout implements C0T8B {
    public final RecyclerView LL;
    public final C1143200fr4 LLILLJJLI;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    public final void setTriggerReason(String str) {
        this.LLILLJJLI.LL = str;
    }

    public C1143190fr3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = new C1143200fr4();
        FrameLayout.inflate(context, R.layout.hze, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bu1);
        this.LL = recyclerView;
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        ImageView imageView = (ImageView) getRootView().findViewById(R.id.k33);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.eqo);
            C786410Ut5.Q7(imageView, new ACListenerS152S0100000_17(this, 43));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ(Long l, ImageModel imageModel, int i, String str, List<Long> list) {
        final C1143200fr4 c1143200fr4 = this.LLILLJJLI;
        AbstractC2172971A2l<C1143240fr8, C1143210fr5> abstractC2172971A2l = new AbstractC2172971A2l<C1143240fr8, C1143210fr5>(c1143200fr4) { // from class: X.0fr6
            public final C1143200fr4 LLILLJJLI;

            {
                super(new AbstractC339510DSr<C1143240fr8>() { // from class: X.0fr7
                    @Override // X.AbstractC339510DSr
                    public final boolean LIZ(C1143240fr8 c1143240fr8, C1143240fr8 c1143240fr82) {
                        C1143240fr8 c1143240fr83 = c1143240fr8;
                        C1143240fr8 c1143240fr84 = c1143240fr82;
                        if (c1143240fr83.LIZJ == c1143240fr84.LIZJ && c1143240fr83.LJ == c1143240fr84.LJ) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.AbstractC339510DSr
                    public final boolean LIZIZ(C1143240fr8 c1143240fr8, C1143240fr8 c1143240fr82) {
                        if (c1143240fr8.LIZJ == c1143240fr82.LIZJ) {
                            return true;
                        }
                        return false;
                    }
                });
                this.LLILLJJLI = c1143200fr4;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                String strLIZIZ;
                C1143210fr5 c1143210fr5 = (C1143210fr5) viewHolder;
                C1143240fr8 c1143240fr8LLLFZ = LLLFZ(i2);
                C1143200fr4 c1143200fr42 = this.LLILLJJLI;
                C500260Jjc.LLFFF(c1143210fr5.LL);
                c1143210fr5.LLILLJJLI = (C16F5) c1143210fr5.LL.findViewById(R.id.btz);
                c1143210fr5.LLILLL = (C16F5) c1143210fr5.LL.findViewById(R.id.bty);
                C1322110kVd c1322110kVd = (C1322110kVd) c1143210fr5.LL.findViewById(R.id.e3l);
                if (c1322110kVd != null) {
                    c1322110kVd.setActualImageResource(R.drawable.etw);
                }
                C16F5 c16f5 = c1143210fr5.LLILLJJLI;
                if (c16f5 != null) {
                    if (C497740JfY.LJJ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1143240fr8LLLFZ.LIZJ);
                        sbLIZ.append('x');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        String strValueOf = String.valueOf(c1143240fr8LLLFZ.LIZJ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('x');
                        sbLIZ2.append(strValueOf);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    c16f5.setText(strLIZIZ);
                }
                C16F5 c16f52 = c1143210fr5.LLILLL;
                if (c16f52 != null) {
                    c16f52.setText(String.valueOf(c1143240fr8LLLFZ.LJ));
                }
                C427690Gpr.LJIIIZ(c1143210fr5.LL);
                C786410Ut5.I7(new ACListenerS83S0300000_17(c1143200fr42, c1143210fr5, c1143240fr8LLLFZ, 1), c1143210fr5.LL);
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                C1143210fr5 c1143210fr5 = new C1143210fr5(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h0f, viewGroup, false));
                try {
                    View view = c1143210fr5.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1143210fr5.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1143210fr5.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1143210fr5.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i2);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1143210fr5.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1143210fr5.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1143210fr5.class.getName();
                return c1143210fr5;
            }
        };
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setAdapter(abstractC2172971A2l);
        }
        LinkedList linkedList = new LinkedList();
        if (l != null) {
            l.longValue();
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                long jLongValue = it2.next().longValue();
                linkedList.addLast(new C1143240fr8(l.longValue(), imageModel, (int) jLongValue, str, jLongValue * ((long) i)));
            }
        }
        abstractC2172971A2l.LLLI(linkedList);
    }
}
