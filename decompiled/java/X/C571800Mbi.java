package X;

import Y.ACallableS415S0100000_8;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Mbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571800Mbi implements InterfaceC580040Mp0 {
    public static final /* synthetic */ int LIZJ = 0;
    public final AtomicBoolean LIZ = new AtomicBoolean(true);
    public final Set<String> LIZIZ = C1664790tQL.LIZJ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashSet, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Set] */
    public final Set<String> LJ() {
        ?? linkedHashSet;
        if (((Boolean) C0AUI.LIZ.getValue()).booleanValue()) {
            linkedHashSet = C571790Mbh.LIZ("DraftAllowListProvider");
        } else {
            Pair<List<AwemeDraft>, Exception> pairLJIIIZ = C0CHQ.LIZ().LJI().LJIILJJIL().LJIIIZ(new C0M4J(false, false, null, C0M4F.ALL, null, 119));
            if (pairLJIIIZ.getSecond() != null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new C20022113Vr().LIZIZ);
                C0CHQ.LIZ().LJI().LIZJ().LJIILIIL("DraftAllowListProvider", pairLJIIIZ.getSecond());
            } else {
                List<AwemeDraft> first = pairLJIIIZ.getFirst();
                AwemeDraft awemeDraftLJII = C0CHQ.LIZ().LJIIJ().LJII();
                ArrayList arrayList = new ArrayList();
                if (first != null && !first.isEmpty()) {
                    arrayList.addAll(first);
                }
                if (awemeDraftLJII != null) {
                    arrayList.add(awemeDraftLJII);
                }
                linkedHashSet = new LinkedHashSet();
                C571770Mbf c571770Mbf = new C571770Mbf();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c571770Mbf.LIZ = (AwemeDraft) it2.next();
                    linkedHashSet.addAll(c571770Mbf.LIZ());
                }
            }
        }
        this.LIZIZ.clear();
        this.LIZIZ.addAll((Collection<? extends String>) linkedHashSet);
        this.LIZ.set(false);
        return linkedHashSet;
    }

    public final boolean LJFF() {
        return this.LIZ.get();
    }

    @Override // X.InterfaceC580050Mp1
    public final Set<String> LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Set<String> setLJ = this.LIZ.get() ? LJ() : this.LIZIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C12ER c12erLIZ = C571810Mbj.LIZ();
        int size = setLJ.size();
        c12erLIZ.getClass();
        C12ER.LIZIZ(size, jCurrentTimeMillis2, "DraftAllowListProvider");
        return setLJ;
    }

    @Override // X.InterfaceC580040Mp0
    public final boolean LIZJ() {
        return LJFF();
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onDeleted(AwemeDraft awemeDraft) {
        IDraftListener.DefaultImpls.onDeleted(this, awemeDraft);
        this.LIZ.set(true);
        if (C371410EhH.LIZ()) {
            C15O7.LIZJ(new ACallableS415S0100000_8(this, 12));
        } else {
            LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
        IDraftListener.DefaultImpls.onUpdated(this, updateParams);
        this.LIZ.set(true);
        if (C371410EhH.LIZ()) {
            C15O7.LIZJ(new ACallableS415S0100000_8(this, 12));
        } else {
            LJ();
        }
    }
}
