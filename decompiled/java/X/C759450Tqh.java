package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Tqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759450Tqh implements InterfaceC1722870uw1 {
    public static final List<C759450Tqh> LJIIIZ = new ArrayList();
    public final Context LIZ;
    public RecyclerView LIZIZ;
    public C759390Tqb LIZJ;
    public Function1<? super JSONObject, Unit> LJII;
    public final List<C759430Tqf> LIZLLL = new ArrayList();
    public final List<C759400Tqc> LJ = new ArrayList();
    public final Map<C759410Tqd, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LJFF = new LinkedHashMap();
    public int LJI = 10000;
    public final List<InterfaceC759720Tr8> LJIIIIZZ = new ArrayList();

    public C759450Tqh(C19EG c19eg) {
        this.LIZ = c19eg;
    }

    @Override // X.InterfaceC1722870uw1
    public final void LIZ(List<? extends C759430Tqf> list) {
        AbstractC21673619ry adapter;
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LIZLLL).addAll(list);
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC1722870uw1
    public final C759430Tqf LIZIZ(int i) {
        AbstractC21673619ry adapter;
        if (i >= 0 && i < ((ArrayList) this.LIZLLL).size()) {
            C759430Tqf c759430Tqf = (C759430Tqf) ListProtector.remove(this.LIZLLL, i);
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemRemoved(i);
            }
            return c759430Tqf;
        }
        return null;
    }

    @Override // X.InterfaceC1722870uw1
    public final void LIZJ(Drawable drawable) {
        C422610Ghf c422610Ghf = new C422610Ghf(this.LIZ, 1);
        c422610Ghf.LJ(drawable);
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(c422610Ghf);
        }
    }

    @Override // X.InterfaceC1722870uw1
    public final void LIZLLL(InterfaceC759720Tr8 interfaceC759720Tr8) {
        ((ArrayList) this.LJIIIIZZ).add(interfaceC759720Tr8);
    }

    @Override // X.InterfaceC1722870uw1
    public final void LJ(AwS605S0100000_26 awS605S0100000_26) {
        this.LJII = awS605S0100000_26;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Tqb, X.19ry] */
    public final void LJFF(RecyclerView recyclerView) throws JSONException {
        AbstractC21674919sB abstractC21674919sB;
        this.LIZIZ = recyclerView;
        recyclerView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC785980UsO(recyclerView, 0));
        ?? r0 = new AbstractC21673619ry<C759420Tqe>(this) { // from class: X.0Tqb
            public final C759450Tqh LL;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return ((ArrayList) this.LL.LIZLLL).size();
            }

            {
                this.LL = this;
            }

            @Override // X.AbstractC21673619ry
            public final int getItemViewType(int i) {
                int i2 = ((C759430Tqf) ListProtector.get(this.LL.LIZLLL, i)).LIZ;
                if (i2 > 9999) {
                    C759410Tqd c759410Tqd = (C759410Tqd) ListProtector.get(this.LL.LIZLLL, i);
                    Integer num = c759410Tqd.LJ;
                    if (num != null) {
                        return num.intValue();
                    }
                    int i3 = this.LL.LJI;
                    c759410Tqd.LJ = Integer.valueOf(i3);
                    this.LL.LJI++;
                    return i3;
                }
                return i2;
            }

            @Override // X.AbstractC21673619ry
            public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                C759420Tqe c759420Tqe = (C759420Tqe) viewHolder;
                super.onViewRecycled(c759420Tqe);
                c759420Tqe.LLIILZL();
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                boolean z;
                C759410Tqd c759410Tqd;
                int itemViewType = getItemViewType(i);
                if (itemViewType > 9999) {
                    itemViewType = 10000;
                }
                Object obj = ListProtector.get(this.LL.LIZLLL, i);
                if (itemViewType <= 9999) {
                    z = true;
                } else {
                    z = false;
                }
                Object obj2 = null;
                if (z) {
                    Iterator it2 = ((ArrayList) this.LL.LJ).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((C759400Tqc) next).LIZ == itemViewType) {
                            obj2 = next;
                            break;
                        }
                    }
                    C759400Tqc c759400Tqc = (C759400Tqc) obj2;
                    if (c759400Tqc != null) {
                        c759400Tqc.LIZJ.invoke((C759420Tqe) viewHolder, (C759430Tqf) obj, Integer.valueOf(i));
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Fail to find view provider func for native card type: ");
                    sbLIZ.append(itemViewType);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                if (obj instanceof C759410Tqd) {
                    Object obj3 = ListProtector.get(this.LL.LIZLLL, i);
                    if (!(obj3 instanceof C759410Tqd) || (c759410Tqd = (C759410Tqd) obj3) == null) {
                        return;
                    }
                    View view = (View) ((LinkedHashMap) this.LL.LJFF).get(c759410Tqd);
                    if (view == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Fail to create spark view for position: ");
                        sbLIZ2.append(i);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return;
                    }
                    view.getLayoutParams().height = c759410Tqd.LIZJ;
                    view.requestLayout();
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("illegal bind data for position: ");
                sbLIZ3.append(i);
                C2188811AlT.LIZIZ(sbLIZ3);
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                int i2;
                boolean z;
                boolean z2;
                Integer num;
                boolean z3;
                if (i <= 9999) {
                    i2 = i;
                } else {
                    i2 = 10000;
                }
                boolean zLIZ = true;
                if (i2 <= 9999) {
                    z = true;
                } else {
                    z = false;
                }
                C759420Tqe c759420Tqe = null;
                Object obj = null;
                c759420Tqe = null;
                if (z) {
                    Iterator it2 = ((ArrayList) this.LL.LJ).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((C759400Tqc) next).LIZ == i2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            obj = next;
                            break;
                        }
                    }
                    C759400Tqc c759400Tqc = (C759400Tqc) obj;
                    if (c759400Tqc != null) {
                        c759420Tqe = c759400Tqc.LIZIZ.invoke(viewGroup);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Fail to find view provider func for native card type: ");
                        sbLIZ.append(i2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c759420Tqe = new C759420Tqe(new View(viewGroup.getContext()));
                    }
                } else {
                    Iterator it3 = ((ArrayList) this.LL.LIZLLL).iterator();
                    int i3 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            C759430Tqf c759430Tqf = (C759430Tqf) it3.next();
                            if ((c759430Tqf instanceof C759410Tqd) && (num = ((C759410Tqd) c759430Tqf).LJ) != null && num.intValue() == i) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 != -1) {
                        C759430Tqf c759430Tqf2 = (C759430Tqf) ListProtector.get(this.LL.LIZLLL, i3);
                        View view = (View) ((LinkedHashMap) this.LL.LJFF).get(c759430Tqf2);
                        if (view != null) {
                            c759420Tqe = new C759420Tqe(view);
                        } else if (c759430Tqf2 instanceof C759410Tqd) {
                            C759470Tqj c759470Tqj = C759470Tqj.LIZ;
                            C759450Tqh c759450Tqh = this.LL;
                            c759470Tqj.getClass();
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C759470Tqj.LIZ(viewGroup.getContext(), (C759410Tqd) c759430Tqf2, c759450Tqh);
                            this.LL.LJFF.put((C759410Tqd) c759430Tqf2, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                            c759420Tqe = new C759420Tqe(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                            if (!sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LIZIZ()) {
                                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                            }
                        }
                    }
                    if (c759420Tqe == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fail to find target h5 do for viewType: ");
                        sbLIZ2.append(i);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c759420Tqe = new C759420Tqe(new View(viewGroup.getContext()));
                    }
                }
                if (c759420Tqe != null) {
                    try {
                        View view2 = c759420Tqe.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                c759420Tqe.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c759420Tqe.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                            zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (zLIZ) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                            stringBuffer.append(" holder ");
                            stringBuffer.append(c759420Tqe.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c759420Tqe.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c759420Tqe.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = c759420Tqe.getClass().getName();
                return c759420Tqe;
            }
        };
        this.LIZJ = r0;
        recyclerView.setAdapter(r0);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.LIZ));
        AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
        if ((itemAnimator instanceof C423520Gj8) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        ((ArrayList) LJIIIZ).add(this);
        Function1<? super JSONObject, Unit> function1 = this.LJII;
        JSONObject jSONObject = new JSONObject();
        C759740TrA.LIZ(jSONObject, function1);
        jSONObject.put("step", "init");
        C1725270uzt.LJ(C1725270uzt.LIZ, "rd_pipo_stellar_open", jSONObject, null, 12);
    }

    public final void LJI(List<? extends C759410Tqd> list) {
        for (C759410Tqd c759410Tqd : list) {
            if (((LinkedHashMap) this.LJFF).get(c759410Tqd) == null) {
                C759470Tqj c759470Tqj = C759470Tqj.LIZ;
                Context context = this.LIZ;
                c759470Tqj.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C759470Tqj.LIZ(context, c759410Tqd, this);
                this.LJFF.put(c759410Tqd, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                if (!sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LIZIZ()) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                }
            }
        }
    }

    public final void LJII(C759400Tqc c759400Tqc) {
        ((ArrayList) this.LJ).add(c759400Tqc);
    }
}
