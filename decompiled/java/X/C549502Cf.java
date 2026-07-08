package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549502Cf extends Message<C549502Cf, C02OF> {
    public static final ProtoAdapter<C549502Cf> ADAPTER = new ProtoAdapter<C549502Cf>() { // from class: X.02Bh
        public final ProtoAdapter<Map<String, C547002Bg>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C547002Bg.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549502Cf decode(ProtoReader protoReader) {
            C549502Cf c549502Cf = new C549502Cf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c549502Cf.sale_props.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c549502Cf.default_local_sign = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549502Cf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549502Cf c549502Cf) {
            C549502Cf c549502Cf2 = c549502Cf;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c549502Cf2.default_local_sign) + this.LIZ.encodedSizeWithTag(2, c549502Cf2.sale_props) + c549502Cf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C549502Cf c549502Cf) {
        }
    };
    public String default_local_sign;
    public Map<String, C547002Bg> sale_props;

    @Override // com.squareup.wire.Message
    public C02OF newBuilder() {
        return null;
    }

    public C549502Cf() {
        super(ADAPTER, ByteString.EMPTY);
        this.sale_props = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
