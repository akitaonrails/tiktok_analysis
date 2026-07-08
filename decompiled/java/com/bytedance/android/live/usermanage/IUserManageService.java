package com.bytedance.android.live.usermanage;

import X.C006A;
import X.C0KXC;
import X.C1106210etP;
import X.C11HU;
import X.C11NJ;
import X.C745220TLc;
import X.C749670Tav;
import X.C749810Tb9;
import X.C749860TbE;
import X.C750740Tce;
import X.C759930TrT;
import X.DialogC752370TfH;
import X.InterfaceC1364105Vn;
import X.InterfaceC749850TbD;
import X.InterfaceC750020TbU;
import X.InterfaceC750500TcG;
import X.InterfaceC752380TfI;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface IUserManageService extends C006A {
    void AQ(C749670Tav c749670Tav, long j, long j2);

    void Ag2(long j, long j2, C749810Tb9 c749810Tb9);

    void B22(long j, User user, C745220TLc c745220TLc, InterfaceC750500TcG interfaceC750500TcG, Long l);

    void BP(C749860TbE c749860TbE, long j, int i);

    void BR1(C749860TbE c749860TbE, long j, int i);

    DialogC752370TfH Bm0(Context context, long j, long j2, long j3, boolean z, InterfaceC752380TfI interfaceC752380TfI, String str, DataChannel dataChannel);

    void KJ2(InterfaceC749850TbD interfaceC749850TbD, boolean z, C750740Tce c750740Tce, long j, long j2, String str);

    void KW0(C749810Tb9 c749810Tb9);

    void OP1(Function1<? super List<C745220TLc>, Unit> function1);

    boolean OX1();

    Object QX(C745220TLc c745220TLc, DataChannel dataChannel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void RN0(Context context, C1106210etP c1106210etP);

    C0KXC Re1(BaseFragment baseFragment, DataChannel dataChannel, C11NJ c11nj);

    C745220TLc Ru0();

    void S70(InterfaceC750020TbU interfaceC750020TbU, boolean z, long j, long j2, String str, Long l);

    void Sw0(InterfaceC749850TbD interfaceC749850TbD, long j);

    boolean aQ0();

    void ac0(InterfaceC749850TbD interfaceC749850TbD, int i, int i2, long j, long j2, long j3, String str, String str2);

    void fJ2(Context context, C759930TrT c759930TrT);

    boolean gQ0();

    String hL0();

    boolean hw0();

    int mx();

    boolean py0();

    boolean qA2();

    C11HU qe0(DataChannel dataChannel);

    void qo1(long j, User user, InterfaceC750500TcG interfaceC750500TcG);

    void w60(long j, DataChannel dataChannel, int i, boolean z, ViolationStatusResponse violationStatusResponse);
}
