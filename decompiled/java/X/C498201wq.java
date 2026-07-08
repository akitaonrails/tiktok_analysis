package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.utils.FileCopyUtilsKt$copyMultiPhotoToGallery$2", f = "FileCopyUtils.kt", l = {}, m = "invokeSuspend")
public final class C498201wq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Set<Uri>>, Object> {
    public final /* synthetic */ Set<String> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Map<String, Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C498201wq(Set<String> set, boolean z, Map<String, Boolean> map, InterfaceC1364105Vn<? super C498201wq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = set;
        this.LLILLJJLI = z;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C498201wq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        boolean zBooleanValue;
        String str;
        String name;
        boolean z2;
        C1C7U.LIZ("FileCopyUtilsKt@2056.copyMultiPhotoToGallery$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C013C c013c = new C013C();
        new C259800zU();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listLLIIII = C13LP.LLIIII(this.LL);
        boolean z3 = this.LLILLJJLI;
        Map<String, Boolean> map = this.LLILLL;
        Iterator it2 = listLLIIII.iterator();
        while (true) {
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2428709fR.LIZIZ());
            sbLIZ.append(new C0VSJ(str3).getName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!z3) {
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        Uri uriLJFF = C2400409as.LJFF(contextLIZ, new C0VSJ(str3).getName(), null);
                        if (uriLJFF == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (uriLJFF != null) {
                            Boolean.valueOf(linkedHashSet.add(uriLJFF));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        z = !new C0VSJ(strLIZIZ).exists();
                    }
                } else {
                    z = !new C0VSJ(strLIZIZ).exists();
                }
            } else {
                z = true;
            }
            Boolean bool = map.get(str3);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (z) {
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        name = new C0VSJ(str3).getName();
                        if (!zBooleanValue) {
                            str2 = "image/png";
                        }
                        str = str3;
                    } catch (Exception e2) {
                        e = e2;
                        str = str3;
                    }
                    try {
                        Uri uriLJJIJIIJI = C2471909mP.LJJIJIIJI(contextLIZ, str3, name, zBooleanValue, str2, 96);
                        if (uriLJJIJIIJI != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c013c.element = z2;
                        if (uriLJJIJIIJI != null) {
                            Boolean.valueOf(linkedHashSet.add(uriLJJIJIIJI));
                        }
                    } catch (Exception e3) {
                        e = e3;
                        TryCatchGuardChecker.doCheck(e);
                        c013c.element = C2354709Kn.LIZLLL(str, strLIZIZ);
                    }
                } else {
                    boolean zLIZLLL = C2354709Kn.LIZLLL(str3, strLIZIZ);
                    c013c.element = zLIZLLL;
                    if (zLIZLLL) {
                        C1065320dpS.LIZ.getClass();
                        C1065320dpS.LIZ(contextLIZ, strLIZIZ);
                    }
                }
            } else {
                c013c.element = true;
            }
        }
        if (!c013c.element) {
            linkedHashSet = null;
        }
        C1C7U.LIZIZ("FileCopyUtilsKt@2056.copyMultiPhotoToGallery$2");
        return linkedHashSet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Set<Uri>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
