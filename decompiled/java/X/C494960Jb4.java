package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.api.AuditInfo;
import com.bytedance.android.livesdk.livesetting.decoration.SubscriptionDSAUrl;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Jb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494960Jb4 extends AbstractC21673619ry<C494970Jb5> {
    public final Context LL;
    public final List<C495170JbP> LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC1631620sYq<C495170JbP, Integer, List<C495170JbP>, Unit> LLILZ;
    public RecyclerView LLILZIL;

    public final void LLLI() {
        List<C495170JbP> list = this.LLILLJJLI;
        if (list.size() > 1) {
            C08XD.LJJ(list, new Comparator() { // from class: X.0Jb6
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    long jLongValue;
                    Long l = ((C495170JbP) t2).LJFF;
                    long jLongValue2 = Long.MAX_VALUE;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = Long.MAX_VALUE;
                    }
                    Long lValueOf = Long.valueOf(jLongValue);
                    Long l2 = ((C495170JbP) t).LJFF;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    }
                    return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(jLongValue2));
                }
            });
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        int size = this.LLILLJJLI.size();
        return size < 10 ? size + 1 : size;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILZIL = recyclerView;
    }

    public static void LLLFZ(C494970Jb5 c494970Jb5, View... viewArr) {
        C786410Ut5.LJLLLLLL(8, c494970Jb5.LLILLL);
        C786410Ut5.LLJJJJ(c494970Jb5.LLILZLL, 8);
        C786410Ut5.LLJJIJIL(c494970Jb5.LLIZ, 8);
        C786410Ut5.LLJJIJIL(c494970Jb5.LLIZLLLIL, 8);
        C786410Ut5.LLJJIJIL(c494970Jb5.LLJI, 8);
        for (View view : viewArr) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        boolean z;
        AuditInfo auditInfo;
        C494970Jb5 c494970Jb5 = (C494970Jb5) viewHolder;
        ConstraintLayout constraintLayout = c494970Jb5.LLJ;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (this.LLILZIL != null) {
            int width = (int) ((r0.getWidth() - C497740JfY.LIZIZ(8)) / 2);
            layoutParams.width = width;
            layoutParams.height = (width / 11) * 6;
        }
        C786410Ut5.m6(constraintLayout, layoutParams);
        if (i <= this.LLILLJJLI.size()) {
            if (i == this.LLILLJJLI.size()) {
                ImageView imageView = c494970Jb5.LL;
                imageView.setImageBitmap(null);
                C500260Jjc.LJIILIIL(c494970Jb5.LLILLJJLI);
                C786410Ut5.Q7(imageView, new View.OnClickListener() { // from class: X.0Jb8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.LL.LLILZ.invoke(null, Integer.valueOf(i), this.LL.LLILLJJLI);
                    }
                });
                LLLFZ(c494970Jb5, c494970Jb5.LLIZ);
                return;
            }
            c494970Jb5.LL.setImageBitmap(((C495170JbP) ListProtector.get(this.LLILLJJLI, i)).LIZ());
            C500260Jjc.LLFFF(c494970Jb5.LLILLJJLI);
            C786410Ut5.g8(c494970Jb5.LLIZLLLIL, new View.OnClickListener() { // from class: X.0Jb7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C494960Jb4 c494960Jb4 = this.LL;
                    c494960Jb4.LLILZ.invoke((C495170JbP) ListProtector.get(c494960Jb4.LLILLJJLI, i), Integer.valueOf(i), this.LL.LLILLJJLI);
                }
            });
            if (((C495170JbP) ListProtector.get(this.LLILLJJLI, i)).LIZJ) {
                LLLFZ(c494970Jb5, c494970Jb5.LLILZLL, c494970Jb5.LLIZLLLIL);
                return;
            }
            AuditInfo auditInfo2 = ((C495170JbP) ListProtector.get(this.LLILLJJLI, i)).LJI;
            long j = 0;
            if (auditInfo2 != null && auditInfo2.violationId > 0 && (auditInfo = ((C495170JbP) ListProtector.get(this.LLILLJJLI, i)).LJI) != null && auditInfo.taskType == 1) {
                z = true;
            } else {
                z = false;
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0Jb3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String string;
                    String appealUrl = SubscriptionDSAUrl.INSTANCE.getValue().getAppealUrl();
                    C494960Jb4 c494960Jb4 = this.LL;
                    AuditInfo auditInfo3 = ((C495170JbP) ListProtector.get(c494960Jb4.LLILLJJLI, i)).LJI;
                    if (auditInfo3 == null || (string = Long.valueOf(auditInfo3.violationId).toString()) == null) {
                        string = "";
                    }
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                    Context context = c494960Jb4.LL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(appealUrl);
                    sbLIZ.append("&violation_id=");
                    sbLIZ.append(string);
                    sbLIZ.append("&enter_from=");
                    sbLIZ.append(c494960Jb4.LLILLL);
                    iActionHandlerService.handle(context, C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            Integer num = ((C495170JbP) ListProtector.get(this.LLILLJJLI, i)).LIZIZ;
            if (num != null) {
                if (num.intValue() == 2) {
                    LLLFZ(c494970Jb5, c494970Jb5.LLILLL, c494970Jb5.LLIZLLLIL);
                    int iLIZIZ = C20736316Cj.LIZIZ(R.attr.c9j, this.LL);
                    c494970Jb5.LLILZ.setIcon(C20736316Cj.LIZLLL(R.attr.dv8, this.LL));
                    c494970Jb5.LLILZ.setIconTint(iLIZIZ);
                    c494970Jb5.LLILZIL.setText(2131844360);
                    c494970Jb5.LLILZIL.setTextColor(iLIZIZ);
                    return;
                }
                if (num.intValue() == 3) {
                    LLLFZ(c494970Jb5, c494970Jb5.LLILLL, c494970Jb5.LLIZLLLIL);
                    C786410Ut5.LLJJIJIL(c494970Jb5.LLJI, 8);
                    int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.etr, this.LL);
                    c494970Jb5.LLILZ.setIcon(C20736316Cj.LIZLLL(R.attr.dn8, this.LL));
                    c494970Jb5.LLILZ.setIconTint(iLIZIZ2);
                    AuditInfo auditInfo3 = ((C495170JbP) ListProtector.get(this.LLILLJJLI, i)).LJI;
                    if (auditInfo3 != null && auditInfo3.violationId > 0) {
                        C786410Ut5.LLJJIJIL(c494970Jb5.LLJI, 0);
                        c494970Jb5.LLJI.setIconTint(iLIZIZ2);
                        C786410Ut5.g8(c494970Jb5.LLJI, onClickListener);
                    }
                    c494970Jb5.LLILZIL.setText(2131844361);
                    c494970Jb5.LLILZIL.setTextColor(iLIZIZ2);
                    return;
                }
                if (num.intValue() == 1) {
                    if (z) {
                        Map<String, Boolean> mapLIZ = C0KPJ.le.LIZ();
                        if (mapLIZ == null) {
                            mapLIZ = new LinkedHashMap<>();
                        }
                        AuditInfo auditInfo4 = ((C495170JbP) ListProtector.get(this.LLILLJJLI, i)).LJI;
                        if (auditInfo4 != null) {
                            j = auditInfo4.violationId;
                        }
                        if (mapLIZ.containsKey(String.valueOf(j))) {
                            LLLFZ(c494970Jb5, c494970Jb5.LLIZLLLIL);
                            return;
                        }
                        LLLFZ(c494970Jb5, c494970Jb5.LLILLL, c494970Jb5.LLIZLLLIL);
                        c494970Jb5.LLILZ.setIcon(C20736316Cj.LIZLLL(R.attr.ejo, this.LL));
                        c494970Jb5.LLILZ.setIconTint(C20736316Cj.LIZIZ(R.attr.f04, this.LL));
                        C786410Ut5.LLJJIJIL(c494970Jb5.LLJI, 0);
                        c494970Jb5.LLJI.setIconTint(-1);
                        C786410Ut5.g8(c494970Jb5.LLJI, onClickListener);
                        c494970Jb5.LLILZIL.setText(2131844400);
                        c494970Jb5.LLILZIL.setTextColor(-1);
                        return;
                    }
                    LLLFZ(c494970Jb5, c494970Jb5.LLIZLLLIL);
                    return;
                }
            }
            LLLFZ(c494970Jb5, c494970Jb5.LLIZLLLIL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C494970Jb5 c494970Jb5 = new C494970Jb5(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.glf, viewGroup, false));
        try {
            View view = c494970Jb5.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c494970Jb5.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c494970Jb5.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C494970Jb5.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c494970Jb5.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c494970Jb5.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C494970Jb5.class.getName();
        return c494970Jb5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C494960Jb4(Context context, List<C495170JbP> list, String str, InterfaceC1631620sYq<? super C495170JbP, ? super Integer, ? super List<C495170JbP>, Unit> interfaceC1631620sYq) {
        this.LL = context;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = interfaceC1631620sYq;
    }
}
