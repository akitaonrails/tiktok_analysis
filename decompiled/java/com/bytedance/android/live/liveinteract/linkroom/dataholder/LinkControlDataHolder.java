package com.bytedance.android.live.liveinteract.linkroom.dataholder;

import X.AbstractC924260a9w;
import X.InterfaceC927720aFW;
import X.InterfaceC948500an2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "LINK_CONTROL_DATA_HOLDER")
public final class LinkControlDataHolder extends AbstractC924260a9w {
    public final CopyOnWriteArrayList<InterfaceC927720aFW> LIZ = new CopyOnWriteArrayList<>();
    public final HashSet<Long> LIZIZ = new HashSet<>();
    public boolean LIZJ;

    public final boolean LIZ(long j) {
        boolean zAdd = this.LIZIZ.add(Long.valueOf(j));
        Iterator<InterfaceC927720aFW> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this.LIZIZ);
        }
        return zAdd;
    }

    public final boolean LIZIZ(long j) {
        return this.LIZIZ.contains(Long.valueOf(j));
    }

    public final void LIZJ(long j) {
        this.LIZIZ.remove(Long.valueOf(j));
        Iterator<InterfaceC927720aFW> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this.LIZIZ);
        }
    }
}
