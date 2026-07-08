package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1BHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2202381BHo {
    Object LIZ(List<SharePermission> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LIZIZ(Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LIZJ(List<Long> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    int LIZLLL();

    MAFIMUser LJ(long j);

    List<MAFIMUser> LJFF(int i);

    List<IMUser> LJI();

    List<IMUser> LJII(List<Long> list);

    Object LJIIIIZZ(Long l, InterfaceC1364105Vn<? super SharePermission> interfaceC1364105Vn);

    Object LJIIIZ(SharePermission sharePermission, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    IMUser LJIIJ(Long l);

    Object LJIIJJI(SharePermission sharePermission, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);
}
