package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestLifecycleAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0YoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885420YoO extends C09AY implements Function2<C03H5, EnumC871430YGn, Unit> {
    public final /* synthetic */ MessageRequestLifecycleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885420YoO(MessageRequestLifecycleAssem messageRequestLifecycleAssem) {
        super(2);
        this.LL = messageRequestLifecycleAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, EnumC871430YGn enumC871430YGn) {
        MessageRequestListVMV2 messageRequestListVMV2M231do = this.LL.m231do();
        for (Map.Entry entry : ((LinkedHashMap) messageRequestListVMV2M231do.LLILZLL).entrySet()) {
            IChatListEngine.LIZ.getClass();
            C884160YmM.LIZ().LJIIIIZZ(((InterfaceC884020Ym8) entry.getValue()).getConfig());
        }
        ((LinkedHashMap) messageRequestListVMV2M231do.LLILZLL).clear();
        ((LinkedHashMap) messageRequestListVMV2M231do.LLIZ).clear();
        ((LinkedHashMap) messageRequestListVMV2M231do.LLJI).clear();
        C0YUD c0yud = messageRequestListVMV2M231do.LLILZ;
        if (c0yud != null) {
            c0yud.LIZJ();
        }
        messageRequestListVMV2M231do.LLIZLLLIL = false;
        messageRequestListVMV2M231do.LLILZ = C0YRM.LIZ(messageRequestListVMV2M231do.a1());
        messageRequestListVMV2M231do.setStateImmediate(AFwS248S0000000_14.get$arr$(356));
        messageRequestListVMV2M231do.refreshData();
        return Unit.LIZ;
    }
}
