package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02o0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C698202o0 extends Message<C698202o0, C698302o1> {
    public static final ProtoAdapter<C698202o0> ADAPTER = new ProtoAdapter<C698202o0>() { // from class: X.02nz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C698202o0 decode(ProtoReader protoReader) {
            C698202o0 c698202o0 = new C698202o0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c698202o0.suffix_dark_icon = C02U1.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c698202o0.suffix_light_icon = C02U1.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c698202o0.dark_icon = C02U1.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c698202o0.light_icon = C02U1.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c698202o0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C698202o0 c698202o0) {
            C698202o0 c698202o02 = c698202o0;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c698202o02.light_icon) + protoAdapter.encodedSizeWithTag(2, c698202o02.dark_icon) + protoAdapter.encodedSizeWithTag(3, c698202o02.suffix_light_icon) + protoAdapter.encodedSizeWithTag(4, c698202o02.suffix_dark_icon) + c698202o02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C698202o0 c698202o0) {
        }
    };
    public C02U1 dark_icon;
    public C02U1 light_icon;
    public C02U1 suffix_dark_icon;
    public C02U1 suffix_light_icon;

    public C698202o0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C698302o1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
