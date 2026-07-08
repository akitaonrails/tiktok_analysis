package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* JADX INFO: renamed from: X.143j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202033143j implements InterfaceC20500115Jn {
    public final boolean LIZ;
    public final C202031143h LIZIZ;

    public C202033143j(Context context, String str, boolean z, boolean z2) {
        this(context, z, true, z2, str);
    }

    @Override // X.InterfaceC20500115Jn
    public final void release() {
        this.LIZIZ.release();
    }

    @Override // X.InterfaceC20500115Jn
    public final void LIZJ(int i) {
        this.LIZIZ.LJ = i;
    }

    @Override // X.InterfaceC20500115Jn
    public final void LIZLLL(List<String> list) {
        this.LIZIZ.LIZLLL(list);
    }

    @Override // X.InterfaceC20500115Jn
    public final void LJJIIJ(String str) {
        this.LIZIZ.LJJIIJ(str);
    }

    @Override // X.InterfaceC20500115Jn
    public final boolean LIZ(List list, InterfaceC202028143e interfaceC202028143e, boolean z, boolean z2) {
        return this.LIZIZ.LIZ(list, interfaceC202028143e, z, z2);
    }

    public /* synthetic */ C202033143j(Context context, boolean z, boolean z2, boolean z3, String str) {
        this(context, str, z, z2, z3, false);
    }

    @Override // X.InterfaceC20500115Jn
    public final boolean LIZIZ(MusicModel musicModel, InterfaceC202028143e interfaceC202028143e, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (C0BND.LIZ()) {
            z4 = this.LIZ;
        } else {
            z4 = false;
        }
        return this.LIZIZ.LJ(musicModel, interfaceC202028143e, z, z2, z3, z4);
    }

    public C202033143j(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z4;
        this.LIZIZ = new C202031143h(context, str, z, z2, z3);
    }
}
