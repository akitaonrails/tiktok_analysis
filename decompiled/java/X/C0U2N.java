package X;

import Y.ARunnableS2S0401000_12;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0U2N, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U2N extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final int LL;
    public final C0U07 LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final C0U2W LLILZ;
    public final C765900U2q<C0U22> LLILZIL;
    public final HashMap<Long, Integer> LLILZLL = new HashMap<>();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZIL.LJFF.size();
    }

    public final String LLLFZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KaraokeSongListAdapter, Category: ");
        sbLIZ.append(C765060Tzk.LIZ(this.LLILZ.getCategoryId()));
        sbLIZ.append(", Tab: ");
        sbLIZ.append(this.LLILZ.getTabName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLII(List<C0U22> list) {
        C765900U2q<C0U22> c765900U2q = this.LLILZIL;
        int i = c765900U2q.LJI + 1;
        c765900U2q.LJI = i;
        List<C0U22> list2 = c765900U2q.LJ;
        if (list != list2) {
            List<C0U22> list3 = c765900U2q.LJFF;
            if (list == 0) {
                int size = list2.size();
                c765900U2q.LJ = null;
                c765900U2q.LJFF = Collections.emptyList();
                c765900U2q.LIZ.LLIZLLLIL(0, size);
                c765900U2q.LIZ(list3, null);
                return;
            }
            if (list2 == null) {
                c765900U2q.LJ = list;
                c765900U2q.LJFF = Collections.unmodifiableList(list);
                c765900U2q.LIZ.LJZL(0, list.size());
                c765900U2q.LIZ(list3, null);
                return;
            }
            c765900U2q.LIZIZ.LIZ.execute(new ARunnableS2S0401000_12(c765900U2q, list2, list, i, 1));
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((C0U22) ListProtector.get(this.LLILZIL.LJFF, i)).LJIIL()) {
            return 6;
        }
        int i2 = C0U08.LIZ[this.LLILLJJLI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                if (i2 == 4) {
                    return 4;
                }
                if (i2 == 5) {
                    return 1;
                }
                return 0;
            }
            return 0;
        }
        return 5;
    }

    public final void LLLI(int i, long j) {
        Iterator<C0U22> it2 = this.LLILZIL.LJFF.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().LIZ == j) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        String strLLLFZ = LLLFZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDownloadProgress, find: ");
        sbLIZ.append(i2);
        sbLIZ.append(", progress: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ(strLLLFZ, C2188811AlT.LIZIZ(sbLIZ));
        if (i2 != -1) {
            if (i >= 100) {
                this.LLILZLL.remove(Long.valueOf(j));
            } else {
                this.LLILZLL.put(Long.valueOf(j), Integer.valueOf(i));
            }
            C20441214yg.LIZIZ(LLLFZ(), "onDownloadProgress1");
            C20441214yg.LIZIZ(LLLFZ(), "onDownloadProgress12");
            notifyItemChanged(i2, Integer.valueOf(i));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C0U2M) {
            C0U2M c0u2m = (C0U2M) viewHolder;
            C0U22 c0u22 = (C0U22) ListProtector.get(this.LLILZIL.LJFF, i);
            c0u2m.LLJ = this.LLILZ;
            c0u2m.N5(c0u22, i, C0U2K.FULL_UPDATE);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0u2g;
        C0U2M c0u2m;
        int i2 = 5;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                c0u2g = new C0U2M(this.LL, C500260Jjc.LJIILL(R.layout.gwz, viewGroup, false));
                            } else {
                                final View viewLJIILL = C500260Jjc.LJIILL(R.layout.gpm, viewGroup, false);
                                c0u2g = new RecyclerView.ViewHolder(viewLJIILL) { // from class: X.0U2u
                                    {
                                        super(viewLJIILL);
                                        C500260Jjc.LLFFF(viewLJIILL.findViewById(R.id.nnp));
                                    }
                                };
                            }
                        } else {
                            final int i3 = this.LL;
                            final View viewLJIILL2 = C500260Jjc.LJIILL(R.layout.gwz, viewGroup, false);
                            final AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(this, 1014);
                            c0u2g = new C0U2G(i3, viewLJIILL2, awS591S0100000_12) { // from class: X.0U2S
                                @Override // X.C0U2G, X.C0U2M
                                public final void N5(C0U22 c0u22, int i4, C0U2K c0u2k) {
                                    super.N5(c0u22, i4, c0u2k);
                                    if (C0U2U.LIZ[c0u2k.ordinal()] == 1) {
                                        C500260Jjc.LJLIIIL(500L, this.itemView, new AwS591S0100000_12(this, 1073));
                                    }
                                }
                            };
                        }
                    } else {
                        final int i4 = this.LL;
                        final View viewLJIILL3 = C500260Jjc.LJIILL(R.layout.gwz, viewGroup, false);
                        final AwS591S0100000_12 awS591S0100000_122 = new AwS591S0100000_12(this, 1015);
                        c0u2g = new C0U2I(i4, viewLJIILL3, awS591S0100000_122) { // from class: X.0U2H
                            public final View LLJJIJIIJIL;
                            public final AwS591S0100000_12 LLJJIJIL;

                            @Override // X.C0U2G
                            public final void T5(C0U22 c0u22) {
                            }

                            @Override // X.C0U2I, X.C0U2G
                            public final void R5(C0U22 c0u22) {
                                super.R5(c0u22);
                                C0U2W c0u2w = this.LLJ;
                                if (c0u2w != null && c0u2w.LIZJ() == 1) {
                                    C500260Jjc.LLFFF(this.LLJILJIL);
                                } else {
                                    C500260Jjc.LJIILIIL(this.LLJILJIL);
                                }
                                W5(c0u22);
                            }

                            @Override // X.C0U2G
                            public final void S5(View view) {
                                this.LLJJIJIL.invoke(view);
                            }

                            @Override // X.C0U2I
                            public final void V5(C0U22 c0u22) {
                                ImageModel imageModel;
                                String str;
                                C0U2X c0u2x = c0u22.LJIILLIIL;
                                String str2 = null;
                                if (c0u2x != null) {
                                    imageModel = c0u2x.LIZJ;
                                } else {
                                    imageModel = null;
                                }
                                if (imageModel != null) {
                                    C500260Jjc.LLFFF(this.LLJJIII);
                                    C1324720kZq c1324720kZq = (C1324720kZq) ListProtector.get(this.LLJJIJI, 0);
                                    C500260Jjc.LLFFF(c1324720kZq);
                                    C1324610kZf c1324610kZfLJFF = C1819620xS4.LIZ().LJFF(Boolean.FALSE);
                                    c1324610kZfLJFF.LJIILIIL = Boolean.TRUE;
                                    c1324610kZfLJFF.LJIIIZ = R.drawable.ela;
                                    c1324610kZfLJFF.LJIIL = new C786400Ut4(c1324720kZq, 3);
                                    c1324610kZfLJFF.LJIIIZ(imageModel);
                                    c1324610kZfLJFF.LJJI(c1324720kZq);
                                    C500260Jjc.LJIILIIL((View) ListProtector.get(this.LLJJIJI, 1));
                                    C500260Jjc.LJIILIIL((View) ListProtector.get(this.LLJJIJI, 2));
                                } else {
                                    C500260Jjc.LJIILIIL(this.LLJJIII);
                                }
                                C16F5 c16f5 = this.LLILZLL;
                                if (c16f5 != null) {
                                    Resources resources = this.itemView.getContext().getResources();
                                    Object[] objArr = new Object[1];
                                    C0U2X c0u2x2 = c0u22.LJIILLIIL;
                                    if (c0u2x2 != null) {
                                        str = c0u2x2.LIZ;
                                        str2 = c0u2x2.LIZ;
                                    } else {
                                        str = null;
                                    }
                                    objArr[0] = C0KVU.LIZIZ(str, str2);
                                    c16f5.setText(resources.getString(2131843313, objArr));
                                }
                                C500260Jjc.LJIILIIL(this.LLIZ);
                                C500260Jjc.LJIILIIL(this.LLIZLLLIL);
                            }

                            public final void W5(C0U22 c0u22) {
                                C0U2W c0u2w;
                                C0U2X c0u2x;
                                C0U2W c0u2w2 = this.LLJ;
                                if ((c0u2w2 != null && c0u2w2.LIZJ() == 1) || ((c0u2w = this.LLJ) != null && c0u2w.LIZJ() == 2 && (c0u2x = c0u22.LJIILLIIL) != null && UserService.getInstance().user().getCurrentUserId() == c0u2x.LIZIZ)) {
                                    C500260Jjc.LLFFF(this.LLJJIJIIJIL);
                                } else {
                                    C500260Jjc.LJIILIIL(this.LLJJIJIIJIL);
                                }
                            }

                            {
                                View viewFindViewById = viewLJIILL3.findViewById(R.id.m3m);
                                this.LLJJIJIIJIL = viewFindViewById;
                                this.LLJJIJIL = new AwS591S0100000_12(this, 1075);
                                C16F5 c16f5 = this.LLJILJIL;
                                if (c16f5 != null) {
                                    c16f5.setText(viewLJIILL3.getContext().getResources().getString(2131843303));
                                    c16f5.setSelected(false);
                                }
                                C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS591S0100000_12(this, 1074));
                            }

                            @Override // X.C0U2I, X.C0U2G, X.C0U2M
                            public final void N5(C0U22 c0u22, int i5, C0U2K c0u2k) {
                                DataChannel dataChannel;
                                super.N5(c0u22, i5, c0u2k);
                                if (C0U2V.LIZ[c0u2k.ordinal()] == 1) {
                                    W5(c0u22);
                                    V5(c0u22);
                                }
                                C20441214yg.LIZIZ("user_show", "onBind");
                                C0U2W c0u2w = this.LLJ;
                                if (c0u2w != null && c0u2w.LIZJ() == 1) {
                                    C0U17 c0u17 = C0U17.LIZ;
                                    C01GW c01gw = C0U17.LJI;
                                    if (!((List) c01gw.getValue()).contains(c0u22)) {
                                        C0U2W c0u2w2 = this.LLJ;
                                        Long lValueOf = null;
                                        if (c0u2w2 != null) {
                                            dataChannel = c0u2w2.getDataChannel();
                                        } else {
                                            dataChannel = null;
                                        }
                                        ((List) c01gw.getValue()).add(c0u22);
                                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_karaoke_request_user_show");
                                        c474500IjALIZ.LJIJJLI(dataChannel);
                                        c474500IjALIZ.LJJII(Long.valueOf(c0u22.LIZ), "music_id");
                                        C0U2X c0u2x = c0u22.LJIILLIIL;
                                        if (c0u2x != null) {
                                            lValueOf = Long.valueOf(c0u2x.LIZIZ);
                                        }
                                        c474500IjALIZ.LJJII(lValueOf, "request_uid");
                                        C0U17.LIZ(c0u17, c474500IjALIZ);
                                        c474500IjALIZ.LIZ();
                                    }
                                }
                            }
                        };
                    }
                } else {
                    c0u2g = new C0U2I(this.LL, C500260Jjc.LJIILL(R.layout.gwz, viewGroup, false), new AwS591S0100000_12(this, 1013));
                }
            } else {
                c0u2g = new C0U2O(this.LL, C500260Jjc.LJIILL(R.layout.gww, viewGroup, false));
            }
        } else {
            c0u2g = new C0U2G(this.LL, C500260Jjc.LJIILL(R.layout.gwz, viewGroup, false), new AwS591S0100000_12(this, 1012));
        }
        if ((c0u2g instanceof C0U2M) && (c0u2m = (C0U2M) c0u2g) != null) {
            if (!C497740JfY.LJJ()) {
                i2 = 3;
            }
            C16F5 c16f5 = c0u2m.LLILZIL;
            if (c16f5 != null) {
                c16f5.setGravity(i2);
            }
            C16F5 c16f52 = c0u2m.LLILZLL;
            if (c16f52 != null) {
                c16f52.setGravity(i2);
            }
            C16F5 c16f53 = c0u2m.LLIZ;
            if (c16f53 != null) {
                c16f53.setGravity(i2);
            }
        }
        try {
            View view = c0u2g.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0u2g.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0u2g.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0u2g.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0u2g.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0u2g.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0u2g.getClass().getName();
        return c0u2g;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C0U2K c0u2k;
        C0U2M c0u2m;
        C0U2G c0u2g;
        C20441214yg.LIZIZ(LLLFZ(), "onBind-Payload start");
        if (list.isEmpty()) {
            C20441214yg.LIZIZ(LLLFZ(), "onBind-FULL UPDATE");
            onBindViewHolder(viewHolder, i);
            return;
        }
        for (Object obj : list) {
            String strLLLFZ = LLLFZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBind-Payload: ");
            sbLIZ.append(obj);
            C20441214yg.LIZIZ(strLLLFZ, C2188811AlT.LIZIZ(sbLIZ));
            if (obj instanceof List) {
                for (Object obj2 : (Iterable) obj) {
                    if ((obj2 instanceof C0U2K) && (c0u2k = (C0U2K) obj2) != null && (viewHolder instanceof C0U2M) && (c0u2m = (C0U2M) viewHolder) != null) {
                        c0u2m.N5((C0U22) ListProtector.get(this.LLILZIL.LJFF, i), i, c0u2k);
                    }
                }
            } else if ((obj instanceof Integer) && (viewHolder instanceof C0U2G) && (c0u2g = (C0U2G) viewHolder) != null) {
                c0u2g.j3(((Number) obj).intValue());
            }
        }
    }

    public C0U2N(int i, C0U07 c0u07, AbstractC765930U2t abstractC765930U2t, AwS556S0100000_12 awS556S0100000_12, C0U0E c0u0e) {
        this.LL = i;
        this.LLILLJJLI = c0u07;
        this.LLILLL = awS556S0100000_12;
        this.LLILZ = c0u0e;
        this.LLILZIL = new C765900U2q<>(this, abstractC765930U2t);
    }
}
