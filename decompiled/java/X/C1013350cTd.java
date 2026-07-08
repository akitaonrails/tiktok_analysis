package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel;
import com.ss.android.ugc.aweme.model.AnoleMultiContentModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013350cTd extends AbstractC683590Qrd<AnoleMultiContentItemModel> implements InterfaceC1010530cP5, InterfaceC1013420cTk, InterfaceC497601wk {
    public final /* synthetic */ C054G LL;
    public final InterfaceC1013390cTh LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final AnonymousClass0950 LLILZ;
    public final C369801c8 LLILZIL;
    public final C1013550cTx LLILZLL;
    public final C1013360cTe LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public C0RAO LLJIJIL;
    public int LLJILJIL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr, X.AbstractC21673619ry
    public final int getItemCount() {
        List<T> list = this.mmItems;
        if (list != 0) {
            return list.size();
        }
        return 0;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LLILLJJLI;
    }

    public C1013350cTd(C1013330cTb c1013330cTb) {
        super(false);
        this.LL = C2296808zG.LIZIZ();
        this.LLILLJJLI = c1013330cTb;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILLL = c2252331DDrLIZIZ;
        this.LLILZ = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLILZIL = new C369801c8(200L);
        this.LLILZLL = new C1013550cTx(c1013330cTb.LIZ.LLJLL);
        this.LLIZ = new C1013360cTe(new C1013370cTf(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLFZ(int r3) {
        /*
            r2 = this;
            X.0cTh r0 = r2.LLILLJJLI
            com.ss.android.ugc.aweme.model.AnoleMultiContentModel r0 = r0.LIZ()
            if (r0 == 0) goto L24
            java.util.List r0 = r0.getContentList()
            if (r0 == 0) goto L24
            int r0 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == 0) goto L24
            int r1 = r1.intValue()
        L20:
            int r0 = r3 + 1
            int r0 = r0 % r1
            return r0
        L24:
            r1 = 1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1013350cTd.LLLFZ(int):int");
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1013630cU5 c1013630cU5;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof C1013630cU5) && (c1013630cU5 = (C1013630cU5) viewHolder) != null) {
            c1013630cU5.N5();
            c1013630cU5.LLILZ.addOnLayoutChangeListener((View.OnLayoutChangeListener) c1013630cU5.LLJILJIL.getValue());
        }
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C1013630cU5 c1013630cU5;
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof C1013630cU5) && (c1013630cU5 = (C1013630cU5) viewHolder) != null) {
            c1013630cU5.LLILZ.removeOnLayoutChangeListener((View.OnLayoutChangeListener) c1013630cU5.LLJILJIL.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1013420cTk
    public final void LLIIL(int i, C0RAO c0rao) {
        List<AnoleMultiContentItemModel> contentList;
        AnoleMultiContentItemModel anoleMultiContentItemModel;
        Integer videoLength;
        int i2;
        List<AnoleMultiContentItemModel> contentList2;
        int iIntValue;
        int iIntValue2;
        Integer videoLength2;
        boolean z;
        int iIntValue3;
        int iIntValue4;
        Integer num;
        String str;
        Integer num2;
        int iIntValue5;
        int iIntValue6;
        String vid;
        List<AnoleMultiContentItemModel> contentList3;
        AnoleMultiContentItemModel anoleMultiContentItemModel2;
        List<AnoleMultiContentItemModel> contentList4;
        AnoleMultiContentItemModel anoleMultiContentItemModel3;
        int iIntValue7;
        Integer num3;
        String str2;
        C0RAW c0raw;
        int iIntValue8;
        String vid2;
        Integer videoLength3;
        List<AnoleMultiContentItemModel> contentList5;
        AnoleMultiContentItemModel anoleMultiContentItemModel4;
        List<AnoleMultiContentItemModel> contentList6;
        AnoleMultiContentItemModel anoleMultiContentItemModel5;
        List<AnoleMultiContentItemModel> contentList7 = null;
        videoLength = null;
        videoLength = null;
        Integer videoLength4 = null;
        int i3 = i;
        if (c0rao instanceof C0RAR) {
            C1013360cTe c1013360cTe = this.LLIZ;
            c1013360cTe.LLILZIL = new ArrayList(c1013360cTe.LLILLJJLI);
            Iterator<C1013410cTj> it2 = c1013360cTe.LL.getStats().iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL = false;
            }
            C1013550cTx c1013550cTxYc = c1013360cTe.LL.yc();
            Integer num4 = (Integer) ((LinkedHashMap) c1013360cTe.LLILLL).get(Integer.valueOf(i3));
            if (num4 != null) {
                iIntValue7 = num4.intValue();
            } else {
                iIntValue7 = 0;
            }
            Integer numValueOf = Integer.valueOf(iIntValue7);
            C1013410cTj c1013410cTj = (C1013410cTj) C13LP.LJJJLZIJ(i3, c1013360cTe.LL.getStats());
            if (c1013410cTj != null) {
                num3 = c1013410cTj.LIZIZ;
            } else {
                num3 = null;
            }
            C1013410cTj c1013410cTj2 = (C1013410cTj) C13LP.LJJJLZIJ(i3, c1013360cTe.LL.getStats());
            if (c1013410cTj2 != null) {
                str2 = c1013410cTj2.LIZJ;
            } else {
                str2 = null;
            }
            c1013550cTxYc.LIZJ(i3, numValueOf, num3, str2);
            c1013360cTe.LIZ(i3, 0);
            int i4 = this.LLJI;
            if (i3 != i4) {
                C0RAO c0rao2 = this.LLJIJIL;
                if ((c0rao2 instanceof C0RAW) && (c0raw = (C0RAW) c0rao2) != null) {
                    int i5 = c0raw.LIZIZ;
                    this.LLIZ.LIZ(i4, i5);
                    Integer num5 = (Integer) ((LinkedHashMap) this.LLIZ.LLILLL).get(Integer.valueOf(i4));
                    if (num5 != null) {
                        iIntValue8 = num5.intValue();
                    } else {
                        iIntValue8 = 0;
                    }
                    C1013550cTx c1013550cTx = this.LLILZLL;
                    AnoleMultiContentModel anoleMultiContentModelLIZ = this.LLILLJJLI.LIZ();
                    if (anoleMultiContentModelLIZ != null && (contentList6 = anoleMultiContentModelLIZ.getContentList()) != null && (anoleMultiContentItemModel5 = (AnoleMultiContentItemModel) C13LP.LJJJLZIJ(i4, contentList6)) != null) {
                        vid2 = anoleMultiContentItemModel5.getVid();
                    } else {
                        vid2 = null;
                    }
                    AnoleMultiContentModel anoleMultiContentModelLIZ2 = this.LLILLJJLI.LIZ();
                    if (anoleMultiContentModelLIZ2 != null && (contentList5 = anoleMultiContentModelLIZ2.getContentList()) != null && (anoleMultiContentItemModel4 = (AnoleMultiContentItemModel) C13LP.LJJJLZIJ(i4, contentList5)) != null) {
                        videoLength3 = anoleMultiContentItemModel4.getVideoLength();
                    } else {
                        videoLength3 = null;
                    }
                    c1013550cTx.LIZ(i4, Integer.valueOf(iIntValue8), Integer.valueOf(i5), videoLength3, vid2);
                }
            }
            LLLI(LLLFZ(i3), C1013240cTS.LIZ);
            if (this.LLJI == getItemCount() - 1 && i3 == 0) {
                this.LLJI = 0;
                this.LLJ = 0;
                this.LLJILJIL = 0;
                this.LLJIJIL = null;
            } else {
                this.LLJILJIL += this.LLJ;
                this.LLJ = 0;
            }
        } else if (c0rao instanceof C0RAP) {
            int i6 = ((C0RAP) c0rao).LIZIZ;
            this.LLIZ.LIZ(i3, i6);
            Integer num6 = (Integer) ((LinkedHashMap) this.LLIZ.LLILLL).get(Integer.valueOf(i3));
            if (num6 != null) {
                iIntValue6 = num6.intValue();
            } else {
                iIntValue6 = 0;
            }
            C1013550cTx c1013550cTx2 = this.LLILZLL;
            AnoleMultiContentModel anoleMultiContentModelLIZ3 = this.LLILLJJLI.LIZ();
            if (anoleMultiContentModelLIZ3 != null && (contentList4 = anoleMultiContentModelLIZ3.getContentList()) != null && (anoleMultiContentItemModel3 = (AnoleMultiContentItemModel) C13LP.LJJJLZIJ(i3, contentList4)) != null) {
                vid = anoleMultiContentItemModel3.getVid();
            } else {
                vid = null;
            }
            AnoleMultiContentModel anoleMultiContentModelLIZ4 = this.LLILLJJLI.LIZ();
            if (anoleMultiContentModelLIZ4 != null && (contentList3 = anoleMultiContentModelLIZ4.getContentList()) != null && (anoleMultiContentItemModel2 = (AnoleMultiContentItemModel) C13LP.LJJJLZIJ(i3, contentList3)) != null) {
                videoLength4 = anoleMultiContentItemModel2.getVideoLength();
            }
            i3 = i3;
            c1013550cTx2.LIZ(i3, Integer.valueOf(iIntValue6), Integer.valueOf(i6), videoLength4, vid);
            C1013360cTe c1013360cTe2 = this.LLIZ;
            Iterator it3 = ((LinkedHashMap) c1013360cTe2.LLILLL).keySet().iterator();
            while (it3.hasNext()) {
                c1013360cTe2.LLILLL.put(Integer.valueOf(((Number) it3.next()).intValue()), 1);
            }
            c1013360cTe2.LLILZ = 0;
            c1013360cTe2.LLILZLL = 1;
            ((ArrayList) c1013360cTe2.LLILZIL).clear();
        } else if (c0rao instanceof C0RAN) {
            C1013360cTe c1013360cTe3 = this.LLIZ;
            if (i3 >= 0) {
                if (i3 < c1013360cTe3.LL.getStats().size()) {
                    Map<Integer, Integer> map = c1013360cTe3.LLILLL;
                    Integer numValueOf2 = Integer.valueOf(i3);
                    Integer num7 = (Integer) ((LinkedHashMap) c1013360cTe3.LLILLL).get(Integer.valueOf(i3));
                    if (num7 != null) {
                        iIntValue3 = num7.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    map.put(numValueOf2, Integer.valueOf(iIntValue3 + 1));
                    Integer num8 = ((C1013410cTj) ListProtector.get(c1013360cTe3.LL.getStats(), i3)).LIZIZ;
                    if (num8 != null) {
                        c1013360cTe3.LIZ(i3, num8.intValue());
                    }
                    C1013550cTx c1013550cTxYc2 = c1013360cTe3.LL.yc();
                    Integer num9 = (Integer) ((LinkedHashMap) c1013360cTe3.LLILLL).get(Integer.valueOf(i3));
                    if (num9 != null) {
                        iIntValue4 = num9.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    C1013410cTj c1013410cTj3 = (C1013410cTj) C13LP.LJJJLZIJ(i3, c1013360cTe3.LL.getStats());
                    if (c1013410cTj3 != null) {
                        num = c1013410cTj3.LIZIZ;
                    } else {
                        num = null;
                    }
                    C1013410cTj c1013410cTj4 = (C1013410cTj) C13LP.LJJJLZIJ(i3, c1013360cTe3.LL.getStats());
                    if (c1013410cTj4 != null) {
                        str = c1013410cTj4.LIZJ;
                    } else {
                        str = null;
                    }
                    C1013410cTj c1013410cTj5 = (C1013410cTj) C13LP.LJJJLZIJ(i3, c1013360cTe3.LL.getStats());
                    if (c1013410cTj5 != null) {
                        num2 = c1013410cTj5.LIZIZ;
                    } else {
                        num2 = null;
                    }
                    c1013550cTxYc2.LIZIZ(i3, Integer.valueOf(iIntValue4), num, num2, str);
                    final int iIntValue9 = ((Number) C13LP.LJJZZIII(((LinkedHashMap) c1013360cTe3.LLILLL).values())).intValue();
                    if (iIntValue9 > c1013360cTe3.LLILZLL) {
                        c1013360cTe3.LLILZLL = iIntValue9;
                        C0RJC c0rjcXc = c1013360cTe3.LL.xc();
                        Iterator<C1013410cTj> it4 = c1013360cTe3.LL.getStats().iterator();
                        final int i7 = 0;
                        while (it4.hasNext()) {
                            Integer num10 = it4.next().LIZIZ;
                            if (num10 != null) {
                                iIntValue5 = num10.intValue();
                            } else {
                                iIntValue5 = 0;
                            }
                            i7 += iIntValue5;
                        }
                        final int i8 = c1013360cTe3.LLILZ;
                        c0rjcXc.LIZ(new C0RAO(iIntValue9, i7, i8) { // from class: X.0RAM
                            public final int LIZ;
                            public final int LIZIZ;
                            public final int LIZJ;

                            @Override // X.C0RAO
                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C0RAM)) {
                                    return false;
                                }
                                C0RAM c0ram = (C0RAM) obj;
                                return this.LIZ == c0ram.LIZ && this.LIZIZ == c0ram.LIZIZ && this.LIZJ == c0ram.LIZJ;
                            }

                            @Override // X.C0RAO
                            public final int hashCode() {
                                return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(C0RAM.class.getSimpleName());
                                sbLIZ.append('_');
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append('_');
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append('_');
                                sbLIZ.append(this.LIZJ);
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            {
                                this.LIZ = iIntValue9;
                                this.LIZIZ = i7;
                                this.LIZJ = i8;
                            }
                        });
                    }
                }
            } else {
                c1013360cTe3.getClass();
            }
            int iLLLFZ = LLLFZ(i3);
            C20632315oP c20632315oPLIZLLL = this.LLILLJJLI.LIZLLL();
            if (c20632315oPLIZLLL != null) {
                if (iLLLFZ != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c20632315oPLIZLLL.LJ(iLLLFZ, z);
            }
            if (i3 == getItemCount() - 1) {
                this.LLJI = 0;
                this.LLJ = 0;
                this.LLJILJIL = 0;
                this.LLJIJIL = null;
            }
        } else if (c0rao instanceof C0RAU) {
            this.LLIZ.LIZ(i3, ((C0RAU) c0rao).LIZIZ);
        } else if (c0rao instanceof C0RAV) {
            this.LLIZ.LIZ(i3, ((C0RAV) c0rao).LIZIZ);
        } else if (c0rao instanceof C0RAW) {
            C0RAW c0raw2 = (C0RAW) c0rao;
            int i9 = c0raw2.LIZIZ;
            this.LLJ = i9;
            int i10 = this.LLJILJIL + i9;
            this.LLIZ.LIZ(i3, i9);
            AnoleMultiContentModel anoleMultiContentModelLIZ5 = this.LLILLJJLI.LIZ();
            if (anoleMultiContentModelLIZ5 != null && (contentList = anoleMultiContentModelLIZ5.getContentList()) != null && (anoleMultiContentItemModel = (AnoleMultiContentItemModel) C13LP.LJJJLZIJ(i3, contentList)) != null && (videoLength = anoleMultiContentItemModel.getVideoLength()) != null && videoLength.intValue() > 0) {
                int iIntValue10 = videoLength.intValue();
                C0RJC playerManager = this.LLILLJJLI.getPlayerManager();
                int i11 = c0raw2.LIZIZ;
                float f = 100 * (i11 / iIntValue10);
                AnoleMultiContentModel anoleMultiContentModelLIZ6 = this.LLILLJJLI.LIZ();
                if (anoleMultiContentModelLIZ6 != null) {
                    contentList7 = anoleMultiContentModelLIZ6.getContentList();
                }
                if (i3 > 0 && contentList7 != null && !contentList7.isEmpty()) {
                    int size = contentList7.size() - 1;
                    if (i3 <= size) {
                        size = i3;
                    }
                    for (int i12 = 0; i12 < size; i12++) {
                        AnoleMultiContentItemModel anoleMultiContentItemModel6 = (AnoleMultiContentItemModel) C13LP.LJJJLZIJ(i12, contentList7);
                        if (anoleMultiContentItemModel6 != null && (videoLength2 = anoleMultiContentItemModel6.getVideoLength()) != null) {
                            iIntValue2 = videoLength2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        i11 += iIntValue2;
                    }
                }
                int iIntValue11 = ((Number) C13LP.LJJZZIII(((LinkedHashMap) this.LLIZ.LLILLL).values())).intValue();
                AnoleMultiContentModel anoleMultiContentModelLIZ7 = this.LLILLJJLI.LIZ();
                if (anoleMultiContentModelLIZ7 != null && (contentList2 = anoleMultiContentModelLIZ7.getContentList()) != null) {
                    Iterator<AnoleMultiContentItemModel> it5 = contentList2.iterator();
                    i2 = 0;
                    while (it5.hasNext()) {
                        Integer videoLength5 = it5.next().getVideoLength();
                        if (videoLength5 != null) {
                            iIntValue = videoLength5.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        i2 += iIntValue;
                    }
                } else {
                    i2 = 0;
                }
                C0RAB c0rab = new C0RAB(i3, f, i11, i10, iIntValue11, i2);
                playerManager.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playback:");
                sbLIZ.append(c0rab);
                C1022620cia.LIZ("MultiContentPlayerManager", C2188811AlT.LIZIZ(sbLIZ));
                Iterator it6 = ((LinkedHashMap) playerManager.LIZ).values().iterator();
                while (it6.hasNext()) {
                    ((Function1) it6.next()).invoke(c0rab);
                }
            }
        }
        this.LLJI = i3;
        this.LLJIJIL = c0rao;
        this.LLILLJJLI.getPlayerManager().LIZ(c0rao);
    }

    public final void LLLI(int i, AbstractC1013190cTN abstractC1013190cTN) {
        if (!Intrinsics.LJFF(abstractC1013190cTN, C1013220cTQ.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendEventToViewHolders called, ");
            sbLIZ.append(i);
            sbLIZ.append(", ");
            sbLIZ.append(abstractC1013190cTN.getClass().getSimpleName());
            C1022620cia.LIZ("MultiContentHorizonAdapter", C2188811AlT.LIZIZ(sbLIZ));
        }
        C23250099c.LIZLLL(this, null, null, new C1013290cTX(this, i, abstractC1013190cTN, null), 3);
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1013630cU5 c1013630cU5;
        AnoleMultiContentItemModel anoleMultiContentItemModel;
        C1013450cTn c1013450cTn = null;
        if (viewHolder instanceof C1013630cU5) {
            c1013630cU5 = (C1013630cU5) viewHolder;
        } else {
            c1013630cU5 = null;
        }
        List<T> list = this.mmItems;
        if (list != 0) {
            anoleMultiContentItemModel = (AnoleMultiContentItemModel) C13LP.LJJJLZIJ(i, list);
        } else {
            anoleMultiContentItemModel = null;
        }
        if (c1013630cU5 != null && anoleMultiContentItemModel != null) {
            boolean zLJJI = C1017180cZo.LJJI(this.LLILLJJLI.LIZIZ().LIZLLL);
            Bitmap bitmapLIZJ = this.LLILLJJLI.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bind at position:");
            sbLIZ.append(i);
            sbLIZ.append(" productVid:");
            sbLIZ.append(anoleMultiContentItemModel.getVid());
            C1022620cia.LIZ("MultiContentVideoItemViewHolder", C2188811AlT.LIZIZ(sbLIZ));
            c1013630cU5.LLJ = anoleMultiContentItemModel;
            c1013630cU5.LLIZ = zLJJI;
            c1013630cU5.LLIZLLLIL = i;
            String cover = anoleMultiContentItemModel.getCover();
            if (c1013630cU5.LLIZLLLIL == 0 && bitmapLIZJ != null) {
                c1013630cU5.LLILZIL.setImageBitmap(bitmapLIZJ);
            } else if (cover != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06ZI(cover, c1013630cU5, null), 3);
            }
            String vid = anoleMultiContentItemModel.getVid();
            List<String> urlList = anoleMultiContentItemModel.getUrlList();
            if (vid != null && urlList != null) {
                c1013450cTn = new C1013450cTn(new C1013380cTg(vid, urlList, c1013630cU5, anoleMultiContentItemModel));
            }
            c1013630cU5.LLILZLL = c1013450cTn;
            c1013630cU5.N5();
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        return new C1013630cU5(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.pp, viewGroup, false), this, this.LLILZ);
    }
}
