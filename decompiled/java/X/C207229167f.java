package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.167f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207229167f extends AbstractC207230167g implements InterfaceC20023413We {
    public InterfaceC207228167e LLILLL;
    public CompletionBlock<InterfaceC1874920ytG> LLILZ;
    public final int LLILZIL = 121;
    public final int LLILZLL = 122;
    public boolean LLIZ;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r20, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r21, X.EnumC1063300dmC r22) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207229167f.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }

    @Override // X.InterfaceC20023413We
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC634840OvC interfaceC634840OvC;
        Context context;
        Context contextLJJIIZI;
        int size;
        if (this.LLILZLL == i2 && this.LLILZIL == i) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            C1161920gLG.LIZJ(IHostSubscription.class);
            InterfaceC207228167e interfaceC207228167e = this.LLILLL;
            int i3 = 0;
            if (interfaceC207228167e != null && (interfaceC634840OvC = this.IBridgeSdkContext) != null && (context = interfaceC634840OvC.getContext()) != null && (contextLJJIIZI = C520010KaN.LJJIIZI(context, false)) != null && intent != null) {
                Number emotesShowStyle = interfaceC207228167e.getEmotesShowStyle();
                if (!Intrinsics.LJFF(emotesShowStyle, 1) && !Intrinsics.LJFF(emotesShowStyle, 2)) {
                    List<LiveSubMediaModel> listCA1 = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).CA1(intent, "choose_photo");
                    size = listCA1.size();
                    InterfaceC1874920ytG interfaceC1874920ytG = (InterfaceC1874920ytG) C1909107dp.LIZJ(InterfaceC1874920ytG.class, null);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listCA1, 10));
                    Iterator<LiveSubMediaModel> it2 = listCA1.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().getUuidStr());
                    }
                    arrayList.addAll(arrayList2);
                    interfaceC1874920ytG.setImageIDs(arrayList);
                    CompletionBlock<InterfaceC1874920ytG> completionBlock = this.LLILZ;
                    if (completionBlock != null) {
                        completionBlock.onSuccess(interfaceC1874920ytG, "");
                    }
                    LifecycleOwner lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(contextLJJIIZI, false);
                    if (lifecycleOwnerLJJIFFI != null) {
                        C500260Jjc.LJJJJJ(lifecycleOwnerLJJIFFI, C0PEM.LIZJ, new C207227167d(listCA1, contextLJJIIZI, interfaceC207228167e, null), 2);
                    }
                } else {
                    List<LiveSubMediaModel> listCA12 = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).CA1(intent, "choose_live_sub_media");
                    size = listCA12.size();
                    InterfaceC1874920ytG interfaceC1874920ytG2 = (InterfaceC1874920ytG) C1909107dp.LIZJ(InterfaceC1874920ytG.class, null);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listCA12, 10));
                    Iterator<LiveSubMediaModel> it3 = listCA12.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(it3.next().getUuidStr());
                    }
                    arrayList3.addAll(arrayList4);
                    interfaceC1874920ytG2.setImageIDs(arrayList3);
                    CompletionBlock<InterfaceC1874920ytG> completionBlock2 = this.LLILZ;
                    if (completionBlock2 != null) {
                        completionBlock2.onSuccess(interfaceC1874920ytG2, "");
                    }
                    LifecycleOwner lifecycleOwnerLJJIFFI2 = C520010KaN.LJJIFFI(contextLJJIIZI, false);
                    if (lifecycleOwnerLJJIFFI2 != null) {
                        C500260Jjc.LJJJJJ(lifecycleOwnerLJJIFFI2, C0PEM.LIZJ, new C207227167d(listCA12, contextLJJIIZI, interfaceC207228167e, null), 2);
                    }
                }
                i3 = size;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_jsb_chooseImage_for_sub");
            c474500IjALIZ.LJJII(Long.valueOf(SystemClock.currentThreadTimeMillis() - jCurrentThreadTimeMillis), "cost");
            c474500IjALIZ.LJJII(Integer.valueOf(i3), "image_list_count");
            c474500IjALIZ.LIZ();
        }
    }
}
