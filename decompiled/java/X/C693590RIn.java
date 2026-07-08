package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693590RIn {
    public static final <ASSEM extends BaseContainer<? extends VContainerProtocol, ? extends C03H5>> void LIZ(ASSEM assem, Function1<? super Assembler, Unit> function1) {
        if (assem.getLifecycle().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            return;
        }
        C723830SaL.LIZ(assem, null, function1);
        C693600RIo.LIZ(assem).vQ2(assem);
    }
}
