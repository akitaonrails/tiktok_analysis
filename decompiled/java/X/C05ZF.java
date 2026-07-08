package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ZF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.common.MediaPickerBottomBarKt$MediaPickerBottomBar$1$1", f = "MediaPickerBottomBar.kt", l = {101}, m = "invokeSuspend")
public final class C05ZF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLL;
    public final /* synthetic */ C1690080u58 LLILZ;
    public final /* synthetic */ C013C LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ZF(int i, SocialMediaPickerViewModel socialMediaPickerViewModel, C1690080u58 c1690080u58, C013C c013c, InterfaceC1364105Vn<? super C05ZF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = socialMediaPickerViewModel;
        this.LLILZ = c1690080u58;
        this.LLILZIL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05ZF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int index;
        int index2;
        Object objLJIIJ;
        C06XG next;
        int size;
        C1C7U.LIZ("MediaPickerBottomBarKt@3ff2.MediaPickerBottomBar$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = this.LLILLJJLI;
            if (i2 >= 0 && i2 < this.LLILLL.xQ2().LIZ.size()) {
                C1690080u58 c1690080u58 = this.LLILZ;
                int i3 = this.LLILLJJLI;
                C013C c013c = this.LLILZIL;
                int i4 = 0;
                if (c013c.element) {
                    c013c.element = false;
                    z = false;
                } else {
                    z = true;
                }
                this.LL = 1;
                C06XG c06xg = (C06XG) C13LP.LJJJLL(c1690080u58.LJIIIZ().LJII());
                if (c06xg != null) {
                    index = c06xg.getIndex();
                } else {
                    index = 0;
                }
                C06XG c06xg2 = (C06XG) C13LP.LJJLIIIJL(c1690080u58.LJIIIZ().LJII());
                if (c06xg2 != null) {
                    index2 = c06xg2.getIndex();
                } else {
                    index2 = 0;
                }
                if (i3 <= index) {
                    if (z) {
                        objLJIIJ = c1690080u58.LJFF(i3, 0, this);
                        if (objLJIIJ != C099R.LJFF()) {
                            objLJIIJ = Unit.LIZ;
                        }
                    } else {
                        objLJIIJ = c1690080u58.LJIIJ(i3, 0, this);
                        if (objLJIIJ != C099R.LJFF()) {
                            objLJIIJ = Unit.LIZ;
                        }
                    }
                } else if (i3 > index2) {
                    int iLIZIZ = c1690080u58.LJIIIZ().LIZIZ() - c1690080u58.LJIIIZ().LIZLLL();
                    Iterator<C06XG> it2 = c1690080u58.LJIIIZ().LJII().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getIndex() == i3) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C06XG c06xg3 = next;
                    if (c06xg3 != null) {
                        size = c06xg3.getSize();
                    } else {
                        C06XG c06xg4 = (C06XG) C13LP.LJJJLL(c1690080u58.LJIIIZ().LJII());
                        if (c06xg4 != null) {
                            size = c06xg4.getSize();
                        } else {
                            size = 0;
                        }
                    }
                    int i5 = iLIZIZ - size;
                    if (i5 >= 0) {
                        i4 = i5;
                    }
                    if (z) {
                        objLJIIJ = c1690080u58.LJFF(i3, -i4, this);
                        if (objLJIIJ != C099R.LJFF()) {
                            objLJIIJ = Unit.LIZ;
                        }
                    } else {
                        objLJIIJ = c1690080u58.LJIIJ(i3, -i4, this);
                        if (objLJIIJ != C099R.LJFF()) {
                            objLJIIJ = Unit.LIZ;
                        }
                    }
                } else {
                    objLJIIJ = Unit.LIZ;
                }
                if (objLJIIJ == objLJFF) {
                    C1C7U.LIZIZ("MediaPickerBottomBarKt@3ff2.MediaPickerBottomBar$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerBottomBarKt@3ff2.MediaPickerBottomBar$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
