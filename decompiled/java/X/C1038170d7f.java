package X;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0d7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038170d7f {
    public static final /* synthetic */ C1038170d7f LIZ = new C1038170d7f();
    public static final List<InterfaceC1038250d7n> LIZIZ = C1697810uHb.LJIIJJI(new InterfaceC1038250d7n() { // from class: X.0d7e
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC1038250d7n
        public final InterfaceC1038230d7l LIZ(Fragment fragment, C1037620d6m c1037620d6m) {
            if (!(fragment instanceof InterfaceC1034470d1h) || c1037620d6m.LIZ != EnumC1037560d6g.WEB) {
                return null;
            }
            return new AbstractC1037530d6d((InterfaceC1034470d1h) fragment, c1037620d6m) { // from class: X.0d7d
                public final InterfaceC1034470d1h LJ;

                @Override // X.AbstractC1037530d6d, X.InterfaceC1038230d7l
                public final void LIZIZ(String str) {
                    InterfaceC1038080d7W interfaceC1038080d7W;
                    if (str != null && (interfaceC1038080d7W = (InterfaceC1038080d7W) this.LJ.Sj(InterfaceC1038080d7W.class)) != null) {
                        interfaceC1038080d7W.LJIILL(str);
                    }
                    super.LIZIZ(str);
                }

                {
                    super(interfaceC1034470d1h, c1037620d6m);
                    this.LJ = interfaceC1034470d1h;
                }

                @Override // X.AbstractC1037530d6d
                public final boolean LIZ(C19EG c19eg, Fragment fragment2, FrameLayout frameLayout) {
                    IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                    if (iAdWebUtils == null) {
                        return false;
                    }
                    iAdWebUtils.pv(true, c19eg, fragment2, null, frameLayout, 0, false, true, false, new AwS595S0100000_16(c19eg, 239), AFwS252S0000000_16.get$arr$(448));
                    return true;
                }
            };
        }
    }, new InterfaceC1038250d7n() { // from class: X.0d7k
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC1038250d7n
        public final InterfaceC1038230d7l LIZ(Fragment fragment, C1037620d6m c1037620d6m) {
            if (!(fragment instanceof InterfaceC1034470d1h) || c1037620d6m.LIZ != EnumC1037560d6g.LYNX) {
                return null;
            }
            return new AbstractC1037530d6d((InterfaceC1034470d1h) fragment, c1037620d6m) { // from class: X.0d7j
                @Override // X.AbstractC1037530d6d
                public final boolean LIZ(C19EG c19eg, Fragment fragment2, FrameLayout frameLayout) {
                    IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                    if (iAdWebUtils == null) {
                        return false;
                    }
                    iAdWebUtils.pv(false, c19eg, fragment2, null, frameLayout, 0, true, true, false, null, AFwS252S0000000_16.get$arr$(29));
                    return true;
                }
            };
        }
    }, new InterfaceC1038250d7n() { // from class: X.0d7I
        @Override // X.InterfaceC1038250d7n
        public final InterfaceC1038230d7l LIZ(Fragment fragment, C1037620d6m c1037620d6m) {
            if (c1037620d6m.LIZ == EnumC1037560d6g.MINI_PROGRAM) {
                return new C1037920d7G(fragment);
            }
            return null;
        }
    }, new InterfaceC1038250d7n() { // from class: X.0d7m
        @Override // X.InterfaceC1038250d7n
        public final InterfaceC1038230d7l LIZ(Fragment fragment, C1037620d6m c1037620d6m) {
            if (c1037620d6m.LIZ == EnumC1037560d6g.SERIES) {
                return new InterfaceC1038230d7l(c1037620d6m) { // from class: X.0d7h
                    public final C1037620d6m LIZIZ;
                    public boolean LIZJ;

                    @Override // X.InterfaceC1038230d7l
                    public final boolean LIZJ(FrameLayout frameLayout, FragmentManager fragmentManager) {
                        return true;
                    }

                    @Override // X.InterfaceC1038230d7l
                    public final void remove() {
                        this.LIZJ = false;
                    }

                    @Override // X.InterfaceC1038230d7l
                    public final void l1() {
                        String strLIZ;
                        IPaidContentService iPaidContentService;
                        if (this.LIZJ) {
                            return;
                        }
                        this.LIZJ = true;
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ == null || abstractC1387200mCcLIZIZ.LIZIZ() == null || (strLIZ = C010W.LIZ(this.LIZIZ.LIZIZ, "is_from_seven_split", "1")) == null || (iPaidContentService = (IPaidContentService) PluggableExtentionKt.pluggableSpi$default(IPaidContentService.class, false, false, false, 14, null)) == null) {
                            return;
                        }
                        iPaidContentService.LJIIIIZZ(strLIZ);
                    }

                    {
                        this.LIZIZ = c1037620d6m;
                    }

                    @Override // X.InterfaceC1038230d7l
                    public final void LIZIZ(String str) {
                        this.LIZJ = false;
                    }
                };
            }
            return null;
        }
    });
}
