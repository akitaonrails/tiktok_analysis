package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EA2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0EA2 extends C2217421BqW implements Function2<ResourceItem, Integer, Unit> {
    public C0EA2(C0EA5 c0ea5) {
        super(2, c0ea5, C0EA5.class, "onStopSeek", "onStopSeek(Lcom/ss/ugc/android/editor/base/resource/ResourceItem;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(ResourceItem resourceItem, Integer num) {
        long jJh;
        boolean z;
        C0E55 player;
        ResourceItem resourceItem2 = resourceItem;
        int iIntValue = num.intValue();
        C0EA5 c0ea5 = (C0EA5) this.receiver;
        if (iIntValue != 0) {
            C360100E9w c360100E9w = c0ea5.LIZIZ;
            C0E48 c0e48Invoke = c360100E9w.LJII.invoke();
            if (c0e48Invoke != null && (player = c0e48Invoke.getPlayer()) != null) {
                jJh = player.Jh();
            } else {
                jJh = 0;
            }
            if (jJh != c360100E9w.LJIIIZ) {
                z = true;
            } else {
                z = false;
            }
            c360100E9w.LJIIIZ = jJh;
            if (z) {
                c360100E9w.LIZ(false);
            }
        }
        if (resourceItem2 != null) {
            c0ea5.LJ.LIZIZ(C0E1V.ADJUST_BEAUTY_VALUE.getNameId(), C0EA3.LIZ(resourceItem2));
        } else {
            c0ea5.getClass();
        }
        return Unit.LIZ;
    }
}
