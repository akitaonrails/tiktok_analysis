package X;

import com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS457S0200000_22;

/* JADX INFO: renamed from: X.0n3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419950n3R implements InterfaceC1418120n0U {
    public final List<MetaExt> LIZ;
    public final String LIZIZ;
    public volatile EnumC1419960n3S LIZJ;
    public Function1<? super List<MetaExt>, Unit> LIZLLL;
    public Function2<? super Integer, ? super String, Unit> LJ;
    public final C1420000n3W LJFF;
    public int LJI;
    public volatile int LJII;
    public volatile int LJIIIIZZ;

    @Override // X.InterfaceC1418120n0U
    public final void LIZIZ() {
        if (this.LIZJ == EnumC1419960n3S.SUCCESS) {
            Function1<? super List<MetaExt>, Unit> function1 = this.LIZLLL;
            if (function1 != null) {
                function1.invoke(this.LJFF.LIZ);
                return;
            }
            return;
        }
        if (this.LIZJ == EnumC1419960n3S.FAILED) {
            Function2<? super Integer, ? super String, Unit> function2 = this.LJ;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(this.LJFF.LIZIZ), this.LJFF.LIZJ);
                return;
            }
            return;
        }
        if (this.LIZJ == EnumC1419960n3S.CANCELED) {
            return;
        }
        EnumC1419960n3S enumC1419960n3S = this.LIZJ;
        EnumC1419960n3S enumC1419960n3S2 = EnumC1419960n3S.COMPRESSING;
        if (enumC1419960n3S == enumC1419960n3S2) {
            return;
        }
        this.LIZJ = enumC1419960n3S2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (MetaExt metaExt : this.LIZ) {
            C1419810n3D.LIZ.getClass();
            MetaExt metaExtLIZIZ = C1418020n0K.LIZIZ(((IMetaInfoDelegate) C1419810n3D.LJ.getValue()).getCompressMetaInfo(C1418020n0K.LIZ(metaExt), this.LIZIZ));
            if (metaExtLIZIZ.width == 0 || metaExtLIZIZ.height == 0) {
                this.LIZJ = EnumC1419960n3S.FAILED;
                this.LJFF.LIZIZ = SmartMovieErrorCode.INPUT_RESOURCE_EXCEPTION.swigValue();
                C1420000n3W c1420000n3W = this.LJFF;
                c1420000n3W.LIZJ = "meta width or height is empty";
                Function2<? super Integer, ? super String, Unit> function22 = this.LJ;
                if (function22 != null) {
                    function22.invoke(Integer.valueOf(c1420000n3W.LIZIZ), this.LJFF.LIZJ);
                    return;
                }
                return;
            }
            this.LJFF.LIZ.add(metaExtLIZIZ);
            if (metaExt.isVideo()) {
                arrayList2.add(C1418020n0K.LIZ(metaExt));
            } else {
                arrayList.add(C1418020n0K.LIZ(metaExt));
            }
        }
        int iMin = Math.min(3, arrayList.size());
        this.LJII = iMin - 1;
        for (int i = 0; i < iMin; i++) {
            LIZLLL(i, arrayList);
        }
        this.LJIIIIZZ = 0;
        LJ(0, arrayList2);
    }

    @Override // X.InterfaceC1418120n0U
    public final void cancel() {
        this.LIZJ = EnumC1419960n3S.CANCELED;
    }

    @Override // X.InterfaceC1418120n0U
    public final void LIZ(Function1<? super List<MetaExt>, Unit> function1) {
        this.LIZLLL = function1;
    }

    @Override // X.InterfaceC1418120n0U
    public final void LIZJ(Function2<? super Integer, ? super String, Unit> function2) {
        this.LJ = function2;
    }

    public final void LIZLLL(int i, List list) {
        boolean z;
        Meta meta = (Meta) C13LP.LJJJLZIJ(i, list);
        if (meta == null || this.LIZJ == EnumC1419960n3S.CANCELED || this.LIZJ == EnumC1419960n3S.FAILED) {
            return;
        }
        String str = this.LIZIZ;
        if (this.LIZ.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        C823050WQl.LIZJ().execute(new RunnableC1419940n3Q(meta, str, z, this, new AwS266S0300000_22(this, meta, list, 33), new AwS457S0200000_22(this, meta, 6)));
    }

    public final void LJ(int i, List list) {
        Meta meta;
        boolean z;
        if (this.LIZJ == EnumC1419960n3S.CANCELED || this.LIZJ == EnumC1419960n3S.FAILED || (meta = (Meta) C13LP.LJJJLZIJ(i, list)) == null) {
            return;
        }
        String str = this.LIZIZ;
        if (this.LIZ.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        C823050WQl.LIZJ().execute(new RunnableC1419940n3Q(meta, str, z, this, new AwS266S0300000_22(this, meta, list, 34), new AwS457S0200000_22(this, meta, 7)));
    }

    public C1419950n3R(String str, List<MetaExt> list, String str2) {
        this.LIZ = list;
        this.LIZIZ = str2;
        C2400909ax.LIZ("AutoCutCompressMetaTask", str);
        this.LIZJ = EnumC1419960n3S.NONE;
        this.LJFF = new C1420000n3W(0);
    }
}
