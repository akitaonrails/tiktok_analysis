package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Euw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379880Euw extends AbstractC21673619ry<C379900Euy> {
    public final List<C379890Eux> LL = new ArrayList();
    public final RecyclerView.RecycledViewPool LLILLJJLI = new RecyclerView.RecycledViewPool();
    public final RecyclerView.RecycledViewPool LLILLL = new RecyclerView.RecycledViewPool();
    public C379770Eul LLILZ;
    public MutableLiveData<C379670Eub> LLILZIL;
    public MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> LLILZLL;
    public Integer LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public final void LLLI(RecyclerView recyclerView) {
        C379900Euy c379900Euy;
        Integer num = this.LLIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iIntValue);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C379900Euy) && (c379900Euy = (C379900Euy) viewHolderFindViewHolderForAdapterPosition) != null) {
                C380120EvK c380120EvK = c379900Euy.LLILLL;
                if (c380120EvK != null) {
                    c380120EvK.LJII();
                }
            } else {
                notifyItemChanged(iIntValue);
            }
            notifyItemChanged(iIntValue, 1001);
        }
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLFZ, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C379900Euy c379900Euy, int i) {
        C379890Eux c379890Eux = (C379890Eux) C13LP.LJJJLZIJ(i, this.LL);
        if (c379890Eux == null) {
            return;
        }
        MutableLiveData<C379670Eub> mutableLiveData = this.LLILZIL;
        MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> mutableLiveData2 = this.LLILZLL;
        RecyclerView.RecycledViewPool recycledViewPool = this.LLILLJJLI;
        RecyclerView.RecycledViewPool recycledViewPool2 = this.LLILLL;
        c379900Euy.LLILZLL = c379890Eux;
        c379900Euy.LL.setText(c379890Eux.LIZJ);
        List<String> listLJIJI = c379890Eux.LJI;
        if (!(!listLJIJI.isEmpty())) {
            listLJIJI = null;
        }
        int i2 = 0;
        if (listLJIJI == null) {
            listLJIJI = C13LQ.LJIJI(new String[]{c379890Eux.LIZ, c379890Eux.LIZIZ});
        }
        List listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C08LY(new C1939607ik(listLJIJI), AFwS231S0000000_3.get$arr$(140)), AFwS229S0000000_2.get$arr$(638)));
        if (listLJJII.isEmpty()) {
            C786410Ut5.LLIZLLLIL(c379900Euy.LLILLJJLI, 8);
            C426750GoL.LJIIIZ(c379900Euy.LL, 0, null, null, null, false, 30);
            c379900Euy.LLILZIL.LLLI(C13BV.INSTANCE);
        } else {
            C786410Ut5.LLIZLLLIL(c379900Euy.LLILLJJLI, 0);
            C426750GoL.LJIIIZ(c379900Euy.LL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, false, 30);
            c379900Euy.LLILZIL.LLLI(listLJJII);
        }
        c379900Euy.LLILLL.setEvent(mutableLiveData);
        c379900Euy.LLILLL.setLongClickEvent(mutableLiveData2);
        c379900Euy.LLILLL.LJFF(c379890Eux.LIZLLL, c379890Eux.LJ);
        c379900Euy.LLILLL.setRecycledViewPool(recycledViewPool);
        c379900Euy.LLILZ.setData(c379890Eux.LJFF);
        if (recycledViewPool2 != null) {
            c379900Euy.LLILZ.setRecycledViewPool(recycledViewPool2);
        }
        Integer num = this.LLIZ;
        if (num != null && num.intValue() == i) {
            Iterator<EditorProAIGCMediaItemModel> it2 = c379890Eux.LJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().isSelected) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            c379900Euy.LLILLL.LIZJ(i2);
        } else {
            c379900Euy.LLILLL.LJII();
        }
        c379900Euy.LLILZ.setOnFunctionClickListener(new AwS371S0200000_5(this, c379900Euy, 226));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C379900Euy c379900Euy = new C379900Euy(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bza, viewGroup, false));
        try {
            View view = c379900Euy.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c379900Euy.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c379900Euy.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C379900Euy.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c379900Euy.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c379900Euy.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C379900Euy.class.getName();
        return c379900Euy;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        List list2;
        boolean z;
        Object next;
        EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus;
        boolean z2;
        boolean z3;
        C379900Euy c379900Euy = (C379900Euy) viewHolder;
        if (list.isEmpty()) {
            onBindViewHolder(c379900Euy, i);
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), 1001)) {
                C379890Eux c379890Eux = c379900Euy.LLILZLL;
                AIGCGenerationParamType aIGCGenerationParamType = null;
                if (c379890Eux == null || (list2 = c379890Eux.LJ) == null) {
                    list2 = C13BV.INSTANCE;
                }
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return;
                }
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (C377150EqX.LIZIZ.contains(((EditorProAIGCMediaItemModel) it3.next()).type)) {
                        Integer num = this.LLIZ;
                        if (num != null && num.intValue() == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Iterator it4 = list2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (((EditorProAIGCMediaItemModel) next).isSelected) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) next;
                        if (editorProAIGCMediaItemModel != null) {
                            editorProAIGCMediaItemModelStatus = editorProAIGCMediaItemModel.status;
                        } else {
                            editorProAIGCMediaItemModelStatus = null;
                        }
                        if (editorProAIGCMediaItemModelStatus == EditorProAIGCMediaItemModelStatus.COMPLETE) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z && z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C379930Ev1 c379930Ev1 = c379900Euy.LLILZ;
                        if (editorProAIGCMediaItemModel != null) {
                            aIGCGenerationParamType = editorProAIGCMediaItemModel.type;
                        }
                        C379920Ev0 c379920Ev0 = c379930Ev1.LL;
                        c379920Ev0.LLILLL = aIGCGenerationParamType;
                        if (z3) {
                            Iterator it5 = ((ArrayList) c379920Ev0.LL).iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                if (((C379910Euz) it5.next()).LIZ == EnumC379800Euo.GENERATE_VIDEO) {
                                    if (i2 >= 0) {
                                        c379920Ev0.notifyItemChanged(i2);
                                        return;
                                    }
                                } else {
                                    i2++;
                                }
                            }
                            ((ArrayList) c379920Ev0.LL).add(new C379910Euz(EnumC379800Euo.GENERATE_VIDEO, true));
                            c379920Ev0.notifyItemInserted(((ArrayList) c379920Ev0.LL).size() - 1);
                            return;
                        }
                        Iterator it6 = ((ArrayList) c379920Ev0.LL).iterator();
                        int i3 = 0;
                        while (it6.hasNext()) {
                            if (((C379910Euz) it6.next()).LIZ == EnumC379800Euo.GENERATE_VIDEO) {
                                if (i3 < 0) {
                                    return;
                                }
                                ListProtector.remove(c379920Ev0.LL, i3);
                                c379920Ev0.notifyItemRemoved(i3);
                                return;
                            }
                            i3++;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }
}
