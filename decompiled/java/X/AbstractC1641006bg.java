package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1641006bg extends AbstractC1549150qPp<InterfaceC1641206bi, Object> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "35934"));

    @InterfaceC1549730qQl(name = "anoleCommonJSB", params = {"business", Scene.SCENE_SERVICE, "scenario", "params"})
    public final String name = "anoleCommonJSB";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final EnumC1063530dmZ getAccess() {
        return this.LL;
    }

    @Override // X.InterfaceC1063710dmr
    public final String getName() {
        return this.name;
    }
}
