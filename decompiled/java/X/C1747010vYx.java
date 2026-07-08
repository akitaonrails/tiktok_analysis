package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstruction;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0vYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1747010vYx {
    public final DeliveryInstruction LIZ;
    public final Address LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final DeliveryInstructionInfo LJFF;
    public final HashMap<String, Object> LJI;

    public C1747010vYx(DeliveryInstruction deliveryInstruction, Address address, int i, String str, String str2, DeliveryInstructionInfo deliveryInstructionInfo, HashMap map, int i2) {
        deliveryInstruction = (i2 & 1) != 0 ? null : deliveryInstruction;
        address = (i2 & 2) != 0 ? null : address;
        i = (i2 & 4) != 0 ? 0 : i;
        str = (i2 & 8) != 0 ? "shipping_address" : str;
        str2 = (i2 & 16) != 0 ? "add" : str2;
        deliveryInstructionInfo = (i2 & 32) != 0 ? null : deliveryInstructionInfo;
        map = (i2 & 64) != 0 ? null : map;
        this.LIZ = deliveryInstruction;
        this.LIZIZ = address;
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = deliveryInstructionInfo;
        this.LJI = map;
    }
}
