package X;

import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.api.room.ComponentLayoutConfig;

/* JADX INFO: renamed from: X.0JcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC495740JcK {
    public final C495920Jcc LIZ;
    public final InterfaceC495690JcF LIZIZ;
    public ViewGroup LIZJ;
    public final List<AbstractC495790JcP<?>> LIZLLL = new ArrayList();

    public abstract void LIZ();

    public abstract EnumC495860JcW LIZLLL();

    public final List<EnumC495780JcO> LIZJ() {
        InterfaceC2044707zh<EnumC495780JcO> entries = EnumC495780JcO.getEntries();
        ArrayList arrayList = new ArrayList();
        for (EnumC495780JcO enumC495780JcO : entries) {
            if (enumC495780JcO.getModule() == LIZLLL()) {
                arrayList.add(enumC495780JcO);
            }
        }
        return arrayList;
    }

    public final boolean LJFF(User user) {
        User.EnigmaInfo enigmaInfo = user.enigmaInfo;
        if ((enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) || this.LIZ.LJIIIIZZ.isEnigma()) {
            return true;
        }
        return false;
    }

    public AbstractC495740JcK(C495920Jcc c495920Jcc, C495810JcR c495810JcR) {
        this.LIZ = c495920Jcc;
        this.LIZIZ = c495810JcR;
    }

    public boolean LIZIZ(User user, Map<AbstractC495790JcP<?>, ? extends Object> map, ComponentLayoutConfig componentLayoutConfig) {
        List<AbstractC495790JcP<?>> list = this.LIZLLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (AbstractC495790JcP abstractC495790JcP : (ArrayList) list) {
            Object obj = map.get(abstractC495790JcP);
            abstractC495790JcP.getClass();
            if (obj == null) {
                obj = null;
            }
            arrayList.add(Boolean.valueOf(abstractC495790JcP.LJIIIZ(user, obj)));
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void LJ(ViewGroup viewGroup, ViewGroup viewGroup2, List<? extends AbstractC495790JcP<?>> list) {
        Object next;
        this.LIZJ = viewGroup;
        if (list != null) {
            for (AbstractC495790JcP<?> abstractC495790JcP : list) {
                abstractC495790JcP.LLILZ = viewGroup2;
                ArrayList arrayList = (ArrayList) this.LIZLLL;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((AbstractC495790JcP) next).LIZLLL().getPriority() > abstractC495790JcP.LIZLLL().getPriority()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                int iIndexOf = arrayList.indexOf(next);
                if (iIndexOf == -1) {
                    ((ArrayList) this.LIZLLL).add(abstractC495790JcP);
                } else {
                    ListProtector.add(this.LIZLLL, iIndexOf, abstractC495790JcP);
                }
            }
        }
        LIZ();
    }
}
