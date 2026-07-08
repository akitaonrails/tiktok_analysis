package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EDG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EDG extends C09AY implements Function2<List<? extends ResourceItem>, Boolean, Object> {
    public final /* synthetic */ C0ED8 LL;
    public final /* synthetic */ C0EDF LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EDG(C0ED8 c0ed8, C0EDF c0edf, long j, boolean z) {
        super(2);
        this.LL = c0ed8;
        this.LLILLJJLI = c0edf;
        this.LLILLL = j;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends ResourceItem> list, Boolean bool) {
        String str;
        Boolean boolValueOf;
        List<ResourceItem> listLIZJ;
        List<? extends ResourceItem> list2 = list;
        boolean zBooleanValue = bool.booleanValue();
        if (this.LL.LJJIFFI) {
            C0EDT c0edt = this.LLILLJJLI.LLJIJIL;
            if (c0edt != null) {
                c0edt.LIZIZ(true, System.currentTimeMillis() - this.LLILLL, zBooleanValue, null, null, false);
            }
            C0EDS c0eds = this.LLILLJJLI.LLJ;
            if (c0eds != null && (listLIZJ = c0eds.LIZJ(list2)) != null) {
                list2 = listLIZJ;
            }
            C0EDF c0edf = this.LLILLJJLI;
            C0ED8 c0ed8 = this.LL;
            for (ResourceItem resourceItem : list2) {
                if (c0edf.LLJJ != null && (str = c0ed8.LIZJ) != null && str.length() != 0) {
                    InterfaceC361290EEl interfaceC361290EEl = c0edf.LLJJ;
                    if (interfaceC361290EEl != null) {
                        boolValueOf = Boolean.valueOf(interfaceC361290EEl.Ar1(c0ed8.LIZJ, Collections.singletonList(resourceItem.getResourceId())));
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                    resourceItem.setFavorite(boolValueOf);
                }
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<? extends ResourceItem> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C0EDQ(it2.next(), 62));
            }
            C0EDF c0edf2 = this.LLILLJJLI;
            c0edf2.LJ();
            c0edf2.setupList(arrayList);
            C0EDS c0eds2 = this.LLILLJJLI.LLJ;
            if (c0eds2 == null) {
                return null;
            }
            c0eds2.LIZIZ(true, this.LLILZ);
            return Unit.LIZ;
        }
        return C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0EDI(this.LLILLJJLI, this.LLILLL, zBooleanValue, list2, this.LL, this.LLILZ, null), 3);
    }
}
