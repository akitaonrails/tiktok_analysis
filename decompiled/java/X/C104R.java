package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.104R, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C104R extends AbstractC191842103k implements InterfaceC191831102z {
    public final C104S LLILLL;

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        List<AbstractC191843103l> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC191843103l> it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().LJ(context), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<C191995109h> it3 = this.LLILLL.LJII.iterator();
        while (true) {
            CharSequence charSequenceLIZ = null;
            if (!it3.hasNext()) {
                break;
            }
            C191995109h next = it3.next();
            C191880104w c191880104wLIZIZ = C191821102p.LIZIZ();
            String str = next.LIZLLL;
            c191880104wLIZIZ.getClass();
            PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, str);
            if (privacySettingsRestrictionItemLJIIJJI == null) {
                privacySettingsRestrictionItemLJIIJJI = new PrivacySettingsRestrictionItem(0, 0, null, 0, -1, null);
            }
            if (C191985108x.LIZLLL(privacySettingsRestrictionItemLJIIJJI).LIZIZ) {
                if (next != null) {
                    C104S c104s = this.LLILLL;
                    int i = c104s.LIZLLL;
                    CharSequence charSequenceLIZ2 = c104s.LJ.LIZ(context);
                    C103N c103n = this.LLILLL.LJFF;
                    if (c103n != null) {
                        charSequenceLIZ = c103n.LIZ(context);
                    }
                    arrayList2.add(new AnonymousClass1046(i, charSequenceLIZ2, charSequenceLIZ, this.LLILLL.LJI));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }

    public C104R(C104S c104s, List<? extends AbstractC191843103l> list) {
        super(list);
        this.LLILLL = c104s;
    }

    @Override // X.InterfaceC191831102z
    public final CharSequence LIZJ(Context context, CharSequence charSequence) {
        CharSequence charSequenceLIZJ;
        C103N c103n = this.LLILLL.LJIIIIZZ;
        if (c103n != null) {
            return c103n.LIZ(context);
        }
        for (Object obj : this.LLILLJJLI) {
            if ((obj instanceof InterfaceC191831102z) && (charSequenceLIZJ = ((InterfaceC191831102z) obj).LIZJ(context, null)) != null && charSequenceLIZJ.length() != 0) {
                return charSequenceLIZJ;
            }
        }
        return null;
    }
}
